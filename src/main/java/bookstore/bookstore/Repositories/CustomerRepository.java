package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
