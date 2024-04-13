package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.PublisherEntity;

public interface PublisherRepository extends JpaRepository<PublisherEntity, Long> {

}
