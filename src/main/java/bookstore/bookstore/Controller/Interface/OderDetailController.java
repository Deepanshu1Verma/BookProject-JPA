package bookstore.bookstore.Controller.Interface;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Entities.OrderDetailEntity;

@RestController
public interface OderDetailController {

    @GetMapping({ "OrderDetail/{id}" })
    public OrderDetailEntity getOrderDetail(@PathVariable Long id);

}
