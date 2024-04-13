package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.ReviewEntity;

public interface ReviewService {
    ReviewEntity getReviewByID(long reviewID);

}
