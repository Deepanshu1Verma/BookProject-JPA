package bookstore.bookstore.Controller.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import bookstore.bookstore.Controller.Interface.OderDetailController;
import bookstore.bookstore.Entities.OrderDetailEntity;
import bookstore.bookstore.Services.Interfaces.OrderDetailService;

@RestController
public class OrderDetailControllerImpl implements OderDetailController {

    @Autowired
    OrderDetailService orderDetailService;

    @Override
    public OrderDetailEntity getOrderDetail(Long id) {
        return this.orderDetailService.getOrderDetailByID(id);
    }

}
