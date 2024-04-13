package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.AuthorEntity;

public interface AuthorService {

    AuthorEntity getAuthorByID(long authorID);

    String getAutNameByID(long authorID);

}
