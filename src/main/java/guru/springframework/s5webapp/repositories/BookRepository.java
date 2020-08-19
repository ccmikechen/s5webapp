package guru.springframework.s5webapp.repositories;

import guru.springframework.s5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
