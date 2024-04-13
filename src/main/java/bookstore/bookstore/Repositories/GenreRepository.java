package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.GenreEntity;

public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
