package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.CustomerEntity;
import bookstore.bookstore.Repositories.CustomerRepository;
import bookstore.bookstore.Services.Interfaces.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public CustomerEntity getCustomerByID(long customerID) {
        CustomerEntity customerEntity = (CustomerEntity) this.customerRepository.findById(customerID)
                .orElse((CustomerEntity) null);
        return customerEntity;
    }

}
