package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.GenreController;
import bookstore.bookstore.Entities.GenreEntity;
import bookstore.bookstore.Services.Interfaces.GenreService;

@RestController
public class GenreControllerImpl implements GenreController {

    @Autowired
    GenreService genreService;

    @Override
    public GenreEntity getGenre(Long id) {
        return this.genreService.getGenreByID(id);

    }

}
