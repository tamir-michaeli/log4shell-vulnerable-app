package fr.christophetd.log4shell.vulnerableapp;

import entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentsController {
    private static final Logger logger = LogManager.getLogger("StudentsController");

    private static final List<Student> students= new LinkedList<Student>();

    @GetMapping("/init")
    public String initStudents() {
        logger.info("Initializing students from db");
        students.add(new Student("Jerry","Seinfeld",34, Arrays.asList("Comedy","Acting")));
        students.add(new Student("Lebron","James",37, Arrays.asList("Sports","Mathematics")));
        students.add(new Student("Kilian","Mbape",23, Arrays.asList("French","Sports")));
        students.add(new Student("Conor","McGregor",32, Arrays.asList("self Defense","Business")));
        students.add(new Student("Bibi","Netanyahu",60, Arrays.asList("Politics","Business")));
        students.add(new Student("Satoshi","Nakamoto",32, Arrays.asList("Cryptography","Computer Science")));
        students.add(new Student("Doctor","Dre",45, Arrays.asList("Production","Music")));
        students.add(new Student("Eric","Clapton",74, Arrays.asList("Music","Songwriting")));
        students.add(new Student("Dave","Chappele",45, Arrays.asList("Philosophy","Comedy")));
        students.add(new Student("Michael","Phelps",38, Arrays.asList("Sports","Swimming")));
        students.stream().forEach(student->logger.info("Fetched student: {}",student.toString()));
        return "Initialized all students from database";
    }

    @GetMapping("/all")
    public String getAllStudentsName(){
        students.stream().forEach(student->logger.info("Student fullname: {}",student.getFullName()));
        return "Returned all student names";
    }

}
