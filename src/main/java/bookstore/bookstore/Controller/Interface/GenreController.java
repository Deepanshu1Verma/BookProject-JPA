package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.GenreEntity;

@RestController
public interface GenreController {

    @GetMapping({ "Genres/{id}" })
    public GenreEntity getGenre(@PathVariable Long id);

}
