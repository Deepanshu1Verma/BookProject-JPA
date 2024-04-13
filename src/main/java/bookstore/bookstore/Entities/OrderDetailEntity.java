package bookstore.bookstore.Entities;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_details")
public class OrderDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderDetailID;

    @ManyToOne
    @JoinColumn(name = "orderID")
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "bookID")
    private BookEntity book;

    private Long quantity;
    private BigDecimal price;

    public BookEntity getBook() {
        return book;
    }

    public OrderEntity getOrder() {
        return order;
    }

    public Long getOrderDetailID() {
        return orderDetailID;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Long getQuantity() {
        return quantity;
    }
}