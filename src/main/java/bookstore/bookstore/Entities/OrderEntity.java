package bookstore.bookstore.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderID;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private CustomerEntity customer;

    private Date orderDate;
    private BigDecimal totalAmount;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<PaymentEntity> payments;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderDetails;

    public CustomerEntity getCustomer() {
        return customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public List<OrderDetailEntity> getOrderDetails() {
        return orderDetails;
    }

    public Long getOrderID() {
        return orderID;
    }

    public List<PaymentEntity> getPayments() {
        return payments;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }
}
