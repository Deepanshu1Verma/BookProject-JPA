package bookstore.bookstore.Entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookID;

    private String ISBN;
    private String title;

    @ManyToOne
    @JoinColumn(name = "authorID")
    private AuthorEntity author;

    @ManyToOne
    @JoinColumn(name = "genreID")
    private GenreEntity genre;

    @ManyToOne
    @JoinColumn(name = "publisherID")
    private PublisherEntity publisher;

    private Date publicationDate;
    private BigDecimal price;
    private Long stockQuantity;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<OrderDetailEntity> orderDetails;

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<ReviewEntity> reviews;

    public AuthorEntity getAuthor() {
        return author;
    }

    public Long getBookID() {
        return bookID;
    }

    public GenreEntity getGenre() {
        return genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public List<OrderDetailEntity> getOrderDetails() {
        return orderDetails;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public List<ReviewEntity> getReviews() {
        return reviews;
    }

    public Long getStockQuantity() {
        return stockQuantity;
    }

    public String getTitle() {
        return title;
    }
}
