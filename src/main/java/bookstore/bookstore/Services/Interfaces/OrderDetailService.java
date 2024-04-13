package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.OrderDetailEntity;

public interface OrderDetailService {
    OrderDetailEntity getOrderDetailByID(long orderDetailID);

}
