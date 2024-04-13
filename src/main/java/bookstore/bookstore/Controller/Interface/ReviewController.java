package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.ReviewEntity;

@RestController
public interface ReviewController {
    @GetMapping({ "Review/{id}" })
    public ReviewEntity getReview(@PathVariable Long id);
}
