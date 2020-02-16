package ro.sda.g9.spring.repository.impl;



import ro.sda.g9.spring.model.Entity;
import ro.sda.g9.spring.repository.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseMethodsImpl<T extends Entity> implements BaseRepository<T> {

    protected List<T> entityList = new ArrayList<>();

    public T findById(int id) {
        return entityList.stream()
                .filter((s) -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public void createEntity(T entity) {

        entityList.add(entity);
    }

    public void updateEntity(T entity) {
        deleteEntity(entity);
        entityList.add(entity);
    }

    public void deleteEntity(T entity) {

        entityList.remove(entity);
    }


}
