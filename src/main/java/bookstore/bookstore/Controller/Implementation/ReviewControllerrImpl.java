package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.ReviewController;
import bookstore.bookstore.Entities.ReviewEntity;
import bookstore.bookstore.Services.Interfaces.ReviewService;

@RestController
public class ReviewControllerrImpl implements ReviewController {

    @Autowired
    ReviewService reviewService;

    @Override
    public ReviewEntity getReview(Long id) {
        return this.reviewService.getReviewByID(id);
    }
}
