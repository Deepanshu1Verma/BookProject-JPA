package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import bookstore.bookstore.Entities.AuthorEntity;

public interface AuthorController {
    @GetMapping("authors/{AuthorID}")
    public AuthorEntity getAuthor(@PathVariable Long AuthorID);
}
