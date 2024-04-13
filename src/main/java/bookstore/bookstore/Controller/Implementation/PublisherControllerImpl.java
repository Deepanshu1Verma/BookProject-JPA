package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.PublisherController;
import bookstore.bookstore.Entities.PublisherEntity;
import bookstore.bookstore.Services.Interfaces.PublisherService;

@RestController
public class PublisherControllerImpl implements PublisherController {

    @Autowired
    PublisherService publisherService;

    @Override
    public PublisherEntity getPunlisher(Long id) {
        return this.publisherService.getPublisherByID(id);
    }
}
