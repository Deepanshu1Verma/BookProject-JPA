package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.OrderController;
import bookstore.bookstore.Entities.OrderEntity;
import bookstore.bookstore.Services.Interfaces.OrderService;

@RestController
public class OrderControllerImpl implements OrderController {

    @Autowired
    OrderService orderService;

    @Override
    public OrderEntity getOrder(Long id) {
        return this.orderService.getOrderByID(id);

    }

}
