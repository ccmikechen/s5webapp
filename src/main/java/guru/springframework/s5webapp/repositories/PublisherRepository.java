package guru.springframework.s5webapp.repositories;

import guru.springframework.s5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
