package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.BookController;
import bookstore.bookstore.Entities.BookEntity;
import bookstore.bookstore.Services.Interfaces.BookService;

@RestController
public class BookControllerImpl implements BookController {

    @Autowired
    BookService bookService;

    @Override
    public String getBook(Long id) {
        return this.bookService.getBookByID(id);
    }

    @Override
    public BookEntity getCompleteBook(Long id) {
        return this.bookService.getCompleteBookByID(id);
    }

}
