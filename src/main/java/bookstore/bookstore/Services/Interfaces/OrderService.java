package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.OrderEntity;

public interface OrderService {
    OrderEntity getOrderByID(long orderID);

}
