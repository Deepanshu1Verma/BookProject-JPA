package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.PaymentController;
import bookstore.bookstore.Entities.PaymentEntity;
import bookstore.bookstore.Services.Interfaces.PaymentService;

@RestController
public class PaymentControllerImpl implements PaymentController {

    @Autowired
    PaymentService paymentService;

    @Override
    public PaymentEntity getPayment(Long id) {
        return this.paymentService.getPaymentByID(id);
    }

}
