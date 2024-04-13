package bookstore.bookstore.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.bookstore.Entities.PaymentEntity;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {

}
