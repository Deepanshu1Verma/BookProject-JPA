package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.PaymentEntity;

public interface PaymentService {
    PaymentEntity getPaymentByID(long paymentID);

}
