package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.GenreEntity;

public interface GenreService {
    GenreEntity getGenreByID(long genreID);

}
