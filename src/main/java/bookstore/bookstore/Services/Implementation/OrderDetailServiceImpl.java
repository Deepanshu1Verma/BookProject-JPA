package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.OrderDetailEntity;
import bookstore.bookstore.Repositories.OrderDetailRepository;
import bookstore.bookstore.Services.Interfaces.OrderDetailService;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public OrderDetailEntity getOrderDetailByID(long orderDetailID) {
        OrderDetailEntity orderDetailEntity = (OrderDetailEntity) this.orderDetailRepository.findById(orderDetailID)
                .orElse((OrderDetailEntity) null);
        return orderDetailEntity;
    }

}
