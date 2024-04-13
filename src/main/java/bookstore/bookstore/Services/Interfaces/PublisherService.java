package bookstore.bookstore.Services.Interfaces;

import bookstore.bookstore.Entities.PublisherEntity;

public interface PublisherService {
    PublisherEntity getPublisherByID(long publisherID);

}
