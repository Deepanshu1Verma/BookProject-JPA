package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.CustomerEntity;

public interface CustomerService {
    CustomerEntity getCustomerByID(long customerID);
}
