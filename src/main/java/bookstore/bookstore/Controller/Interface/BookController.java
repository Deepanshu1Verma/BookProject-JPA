package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.BookEntity;

@RestController
public interface BookController {

    @GetMapping({ "Books/{id}" })
    public String getBook(@PathVariable Long id);

    @GetMapping({ "CompleteBook/{id}" })
    public BookEntity getCompleteBook(@PathVariable Long id);
}
