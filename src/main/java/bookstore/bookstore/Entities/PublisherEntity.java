package bookstore.bookstore.Entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "publishers")
public class PublisherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherID;

    private String publisherName;
    private String address;

    @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private List<BookEntity> books;

    public String getAddress() {
        return address;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public Long getPublisherID() {
        return publisherID;
    }

    public String getPublisherName() {
        return publisherName;
    }
}