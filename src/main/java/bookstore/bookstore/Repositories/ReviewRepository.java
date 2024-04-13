package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.ReviewEntity;

public interface ReviewRepository extends JpaRepository<ReviewEntity, Long> {

}
