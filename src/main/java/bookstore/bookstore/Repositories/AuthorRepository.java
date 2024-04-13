package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.AuthorEntity;

public interface AuthorRepository extends JpaRepository<AuthorEntity, Long> {
}
