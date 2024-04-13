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
@Table(name = "genres")
public class GenreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long genreID;

    private String genreName;

    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    private List<BookEntity> books;

    public List<BookEntity> getBooks() {
        return books;
    }

    public Long getGenreID() {
        return genreID;
    }

    public String getGenreName() {
        return genreName;
    }
}