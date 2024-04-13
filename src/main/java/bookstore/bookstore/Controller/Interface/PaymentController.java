package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.PaymentEntity;

@RestController
public interface PaymentController {
    @GetMapping({ "Payment/{id}" })
    public PaymentEntity getPayment(@PathVariable Long id);
}
