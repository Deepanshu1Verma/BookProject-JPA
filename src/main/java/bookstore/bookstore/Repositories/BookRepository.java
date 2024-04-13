package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
