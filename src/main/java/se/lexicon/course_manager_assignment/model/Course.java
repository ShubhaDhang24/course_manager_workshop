package se.lexicon.course_manager_assignment.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class Course {
    private int id;
    private String courseName;
    private int weekDuration;
    LocalDate startDate;
    Collection<Student> students;

    //GETTERS AND SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id && weekDuration == course.weekDuration && Objects.equals(courseName, course.courseName) && Objects.equals(startDate, course.startDate) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, courseName, weekDuration, startDate, students);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", courseName='" + courseName + '\'' +
                ", weekDuration=" + weekDuration +
                ", startDate=" + startDate +
                ", students=" + students +
                '}';
    }
    //CONSTRUCTOR
    public Course(int id, String courseName, int weekDuration, LocalDate startDate, Collection<Student> students) {
        this.id = id;
        this.courseName = courseName;
        this.weekDuration = weekDuration;
        this.startDate = startDate;
        this.students = students;
    }

    public boolean enrollStudent(Student student)
    {
        //TODO ADD STUDENT.class to Collections make sure you don't add null
        Student student1=new Student(1,"Shubha","shubha@gmail.com","Jönköping-55464");
        Student student2=new Student(2,"Sam","sam@gmail.com","Huskvarna-55468");

        HashMap<Integer,Student> studentList=new HashMap<>();
        if(studentList.values()==null)
        {
            return false;
        }
        studentList.put(student1.getId(), student1);
        studentList.put(student2.getId(), student2);
        return true;
    }
    public boolean unEnrollStudent(HashMap<Integer,Student>  studentList)
    {
        if(studentList.containsKey(id))
        {
            studentList.remove(id);
            return true;
        }
        return false;
    }
}
