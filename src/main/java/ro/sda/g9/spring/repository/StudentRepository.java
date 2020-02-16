package ro.sda.g9.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.sda.g9.spring.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    Student findByCnp(String cnp);

    Student findByName(String name);
}
