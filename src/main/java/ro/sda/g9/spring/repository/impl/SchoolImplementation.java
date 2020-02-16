package ro.sda.g9.spring.repository.impl;

import org.springframework.stereotype.Repository;
import ro.sda.g9.spring.model.School;
import ro.sda.g9.spring.repository.SchoolRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SchoolImplementation extends BaseMethodsImpl<School> implements SchoolRepository {

    //List<School> schoolList = new ArrayList<>();

    public List<School> findByName(String name) {
        return entityList.stream()
                .filter((s) -> s.getName().equals(name))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "SchoolImplementation{" +
                "entityList=" + entityList +
                '}';
    }
}
