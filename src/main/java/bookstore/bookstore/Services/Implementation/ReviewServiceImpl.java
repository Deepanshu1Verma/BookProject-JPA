package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.ReviewEntity;
import bookstore.bookstore.Repositories.ReviewRepository;
import bookstore.bookstore.Services.Interfaces.ReviewService;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public ReviewEntity getReviewByID(long reviewID) {
        ReviewEntity reviewEntity = (ReviewEntity) this.reviewRepository.findById(reviewID)
                .orElse((ReviewEntity) null);
        return reviewEntity;
    }

}
