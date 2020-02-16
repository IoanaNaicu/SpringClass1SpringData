package ro.sda.g9.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.g9.spring.config.ApplicationConfiguration;

public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(); //clasa in Spring
        applicationContext.register(ApplicationConfiguration.class);
        applicationContext.refresh();

        SchoolsManager schoolsManager = (SchoolsManager) applicationContext.getBean("schoolsManager");
        schoolsManager.saveData();
    }
}
