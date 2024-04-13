package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.PaymentEntity;
import bookstore.bookstore.Repositories.PaymentRepository;
import bookstore.bookstore.Services.Interfaces.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public PaymentEntity getPaymentByID(long paymentID) {
        PaymentEntity paymentEntity = (PaymentEntity) this.paymentRepository.findById(paymentID)
                .orElse((PaymentEntity) null);
        return paymentEntity;
    }

}
