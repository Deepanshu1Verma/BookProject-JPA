package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.BookEntity;
import bookstore.bookstore.Repositories.BookRepository;
import bookstore.bookstore.Services.Interfaces.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public String getBookByID(long bookID) {
        try {
            BookEntity bookEntity = (BookEntity) this.bookRepository.findById(bookID).orElse((BookEntity) null);
            if (bookEntity != null) {
                StringBuilder result = new StringBuilder();
                result.append("ID: ").append(bookEntity.getBookID()).append("\n");
                result.append("ISBN: ").append(bookEntity.getISBN()).append("\n");
                result.append("Title: ").append(bookEntity.getTitle()).append("\n");
                result.append("Price: ").append(bookEntity.getPrice()).append("\n");
                result.append("Stock Quantity: ").append(bookEntity.getStockQuantity()).append("\n");
                // Append other details if needed

                // BookEntity book = new BookEntity();
                // BeanUtils.copyProperties(bookEntity, book);
                // String id = String.valueOf(book.getBookID());
                // String price = String.valueOf(book.getPrice());
                // String stockQuantity = String.valueOf(book.getStockQuantity());
                // return "\nID: " + id + "\nISBN: " + book.getISBN() + "\nTitle: " +
                // book.getTitle() + "\nprice: " +
                // price
                // + "\nstockQuantity: " + stockQuantity;

                return result.toString();
            } else {
                return "The book does not exist.";
            }
        } catch (Exception var4) {
            return "You did not get connected to database";
        }
    }

    @Override
    public BookEntity getCompleteBookByID(long bookID) {
        // try {
        BookEntity bookEntity = (BookEntity) this.bookRepository.findById(bookID).orElse((BookEntity) null);
        // if (bookEntity != null) {
        return bookEntity;
        // } else {
        // ;
        // }
        // } catch (Exception var4) {
        // ;
        // }
    }

}
