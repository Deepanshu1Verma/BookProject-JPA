package bookstore.bookstore.Services.Implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookstore.bookstore.Entities.PublisherEntity;
import bookstore.bookstore.Repositories.PublisherRepository;
import bookstore.bookstore.Services.Interfaces.PublisherService;

@Service
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    @Override
    public PublisherEntity getPublisherByID(long publisherID) {
        PublisherEntity publisherEntity = (PublisherEntity) this.publisherRepository.findById(publisherID)
                .orElse((PublisherEntity) null);
        return publisherEntity;
    }

}
