package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.OrderEntity;
import bookstore.bookstore.Repositories.OrderRepository;
import bookstore.bookstore.Services.Interfaces.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderEntity getOrderByID(long orderID) {
        OrderEntity orderEntity = (OrderEntity) this.orderRepository.findById(orderID)
                .orElse((OrderEntity) null);
        return orderEntity;
    }

}
