package ro.sda.g9.spring.repository.impl;

import org.springframework.stereotype.Repository;
import ro.sda.g9.spring.model.Student;
import ro.sda.g9.spring.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentImplementation extends  BaseMethodsImpl<Student> implements StudentRepository {

       public Student findByCnp(String cnp) {

        return entityList.stream()
                .filter((s) -> s.getCnp().equals(cnp))
                .findFirst()
                .orElse(null);
    }

    public Student findByName(String name) {
        return entityList.stream()
                .filter((s) -> s.getName().equals(name))
                .findFirst()
                .orElse(null);
    }


}
