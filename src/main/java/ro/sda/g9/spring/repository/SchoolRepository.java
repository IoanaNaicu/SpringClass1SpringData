package ro.sda.g9.spring.repository;

import org.springframework.stereotype.Repository;
import ro.sda.g9.spring.model.School;
import java.util.List;

@Repository
public interface SchoolRepository extends BaseRepository<School>{
    List<School> findByName(String name);

}
