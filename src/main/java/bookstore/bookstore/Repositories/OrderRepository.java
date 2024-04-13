package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
