package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.PublisherEntity;

@RestController
public interface PublisherController {

    @GetMapping({ "Publisher/{id}" })
    public PublisherEntity getPunlisher(@PathVariable Long id);

}
