package io.turntabl.university;
import java.util.List;

public class Course {
    private List<Student> listOfStudents;
    private Lecturer courseLecturer;

    public Course(List<Student> listOfStudents, Lecturer courseLecturer) {
        this.listOfStudents = listOfStudents;
        this.courseLecturer = courseLecturer;
    }

    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public Lecturer getCourseLecturer() {
        return courseLecturer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "listOfStudents=" + listOfStudents +
                ", courseLecturer=" + courseLecturer +
                '}';
    }
}

