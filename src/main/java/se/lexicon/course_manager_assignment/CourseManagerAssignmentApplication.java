package se.lexicon.course_manager_assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.lexicon.course_manager_assignment.model.Course;
import se.lexicon.course_manager_assignment.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SpringBootApplication
public class CourseManagerAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(CourseManagerAssignmentApplication.class, args);

    }

}
