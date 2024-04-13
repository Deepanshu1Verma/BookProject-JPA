package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.OrderEntity;

@RestController
public interface OrderController {

    @GetMapping({ "Order/{id}" })
    public OrderEntity getOrder(@PathVariable Long id);

}
