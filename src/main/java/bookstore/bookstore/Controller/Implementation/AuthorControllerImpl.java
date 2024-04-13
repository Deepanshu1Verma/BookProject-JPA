package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.AuthorController;
import bookstore.bookstore.Entities.AuthorEntity;
import bookstore.bookstore.Services.Interfaces.AuthorService;

@RestController
public class AuthorControllerImpl implements AuthorController {

    @Autowired
    AuthorService authorService;

    @Override
    public AuthorEntity getAuthor(Long AuthorID) {
        return this.authorService.getAuthorByID(AuthorID);
    }
}
