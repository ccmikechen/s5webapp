package guru.springframework.s5webapp.repositories;

import guru.springframework.s5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
