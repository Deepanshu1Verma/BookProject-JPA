package bookstore.bookstore.Entities;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reviews")
public class ReviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reviewID;

    @ManyToOne
    @JoinColumn(name = "bookID")
    private BookEntity book;

    @ManyToOne
    @JoinColumn(name = "customerID")
    private CustomerEntity customer;

    private BigDecimal rating;
    private String comment;
    private Date reviewDate;

    public BookEntity getBook() {
        return book;
    }

    public String getComment() {
        return comment;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public Long getReviewID() {
        return reviewID;
    }
}