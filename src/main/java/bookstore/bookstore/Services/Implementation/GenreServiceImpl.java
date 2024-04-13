package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.GenreEntity;
import bookstore.bookstore.Repositories.GenreRepository;
import bookstore.bookstore.Services.Interfaces.GenreService;

@Service
public class GenreServiceImpl implements GenreService {

    @Autowired
    private GenreRepository genreRepository;

    @Override
    public GenreEntity getGenreByID(long genreID) {
        GenreEntity genreEntity = (GenreEntity) this.genreRepository.findById(genreID).orElse((GenreEntity) null);
        return genreEntity;

    }

}
