package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.BookEntity;

public interface BookService {
    String getBookByID(long bookID);

    BookEntity getCompleteBookByID(long bookID);
}
