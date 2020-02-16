package ro.sda.g9.spring;

import org.springframework.stereotype.Service;
import ro.sda.g9.spring.model.School;
import ro.sda.g9.spring.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class DataReader {

    public List<Student> readStudents() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Students's no");
        int studentsCount = scanner.nextInt();

        List<Student> students = new ArrayList<>();
        for(int i=0; i<studentsCount;i++) {
            System.out.println("Enter name");
            String name = scanner.next();
            System.out.println("Enter CNP ");
            String cnp = scanner.next();
            Student student = new Student();
            student.setName(name);
            student.setCnp(cnp);
            students.add(student);
        }
        return students;
    }

    public List<School> readSchools(){
        Scanner sc = new Scanner(System.in);
        System.out.println("School's no");
        int schoolsCount = sc.nextInt();

        List<School> schools = new ArrayList<>();
        for(int i = 0; i< schoolsCount; i++) {
            System.out.println("Enter name");
            String name = sc.next();
            School school = new School();
            school.setName(name);
            schools.add(school);
        }
        return schools;
    }

}
