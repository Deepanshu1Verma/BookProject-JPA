package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.CustomerController;
import bookstore.bookstore.Entities.CustomerEntity;
import bookstore.bookstore.Services.Interfaces.CustomerService;

@RestController
public class CustomerControllerImpl implements CustomerController {

    @Autowired
    CustomerService customerService;

    @Override
    public CustomerEntity getCustomer(Long id) {
        return this.customerService.getCustomerByID(id);
    }

}
