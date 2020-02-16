package ro.sda.g9.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.sda.g9.spring.model.School;
import ro.sda.g9.spring.model.Student;
import ro.sda.g9.spring.repository.SchoolRepository;
import ro.sda.g9.spring.repository.StudentRepository;

@Component
public class SchoolsManager {

    private SchoolRepository schoolRepository;
    private StudentRepository studentRepository;
    private DataReader dataReader;

    @Autowired
    public SchoolsManager(SchoolRepository schoolRepository, StudentRepository studentRepository, DataReader dataReader) {
        this.schoolRepository = schoolRepository;
        this.studentRepository = studentRepository;
        this.dataReader = dataReader;
    }

    public void saveStudents() {
        studentRepository.saveAll(dataReader.readStudents());

    }

    public void saveSchools() {
        schoolRepository.saveAll(dataReader.readSchools());
    }
}
