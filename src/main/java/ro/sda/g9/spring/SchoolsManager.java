package ro.sda.g9.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.sda.g9.spring.model.School;
import ro.sda.g9.spring.model.Student;
import ro.sda.g9.spring.repository.SchoolRepository;
import ro.sda.g9.spring.repository.StudentRepository;

@Component
public class SchoolsManager {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private StudentRepository studentRepository;

    //recomandat sa fie Autowired pe constructor (sa fii sigur ca construirea unui schoolManager se face corect)

//    @Autowired
//    public SchoolsManager(SchoolRepository schoolRepository, StudentRepository studentRepository) {
//        this.schoolRepository = schoolRepository;
//        this.studentRepository = studentRepository;
//    }

    public void saveData() {
        Student student1 = new Student();
        student1.setId(1);
        student1.setCnp("2900413989542");
        student1.setName("Alex");

        Student student2 = new Student();
        student2.setId(2);
        student2.setCnp("19412913989542");
        student2.setName("Popa Ion");

        School school1 = new School();
        school1.setId(1);
        school1.setName("Colegiul Emil Racovita");

        School school2 = new School();
        school2.setId(2);
        school2.setName("Colegiul Mihai Viteazu");

        studentRepository.createEntity(student1);
        studentRepository.createEntity(student2);


        schoolRepository.createEntity(school1);
        schoolRepository.createEntity(school2);

        System.out.println("hello");

    }


}
