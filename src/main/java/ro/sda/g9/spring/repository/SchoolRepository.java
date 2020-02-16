package ro.sda.g9.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.sda.g9.spring.model.School;
import java.util.List;

@Repository
public interface SchoolRepository extends CrudRepository<School, Long> {
    List<School> findByName(String name);

}
