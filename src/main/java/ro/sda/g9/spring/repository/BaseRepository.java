package ro.sda.g9.spring.repository;

import ro.sda.g9.spring.model.Entity;
import ro.sda.g9.spring.model.School;
import ro.sda.g9.spring.model.Student;

public interface BaseRepository<T extends Entity> {

    void createEntity(T entity);
    void updateEntity(T entity);
    void deleteEntity(T entity);

    T findById(int id);


//    default int getId(T entity){
//       if(entity.getClass().equals(School.class)) {
//           return  ((School) entity).getId();
//       } else if (entity.getClass().equals(Student.class)) {
//           return ((Student) entity).getId();
//       }
//       return 0;
//    }


}
