package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.AuthorEntity;
import bookstore.bookstore.Repositories.AuthorRepository;
import bookstore.bookstore.Services.Interfaces.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public String getAutNameByID(long authorID) {
        try {
            AuthorEntity authorEntity = (AuthorEntity) this.authorRepository.findById(authorID)
                    .orElse((AuthorEntity) null);
            if (authorEntity != null) {
                AuthorEntity author = new AuthorEntity();
                BeanUtils.copyProperties(authorEntity, author);
                String id = String.valueOf(author.getAuthorID());
                return "\nID: " + id + "\nName: " + author.getFirstName() + " " +
                        author.getLastName();
            } else {
                return "The author does not exist.";
            }
        } catch (Exception var4) {
            return "You did not get connected to database";
        }
    }

    public AuthorEntity getAuthorByID(long authorID) {
        AuthorEntity authorEntity = (AuthorEntity) this.authorRepository.findById(authorID)
                .orElse((AuthorEntity) null);
        return authorEntity;

    }
}
