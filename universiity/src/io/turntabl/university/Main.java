package io.turntabl.university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //creating Lecturers
        Lecturer lecturer1 = new Lecturer("Alexander", LectCourses.PROGRAMING);
        Lecturer lecturer2 = new Lecturer("Erica", LectCourses.GARDENING);
        Lecturer lecturer3 = new Lecturer("Shade", LectCourses.PHYSICS) ;

        List<Student> students = Arrays.asList(
                new Student("Ama", 123, Level.FIRST),
                new Student("Yaa", 123, Level.FOURTH),
                new Student("Evans", 123, Level.THIRD),
                new Student("Rhoda", 123, Level.SECOND),
                new Student("Franklin"git, 123, Level.FIRST),
                new Student("Boachie", 123, Level.SECOND),
                new Student("Sam", 123, Level.THIRD),
                new Student("Moorhouse", 123, Level.THIRD),
                new Student("Ivan", 123, Level.FIRST),
                new Student("Luther", 123, Level.FIRST)
                );

        printStudent(students);

        List<Student> firstYear = new ArrayList<>();

        for (Student thyear : students){
            if(thyear.getYear() == Level.FIRST){
                firstYear.add(thyear);
            }
        }

        Course course1 = new Course(firstYear, lecturer1);

        List<Student> fourthAndThirdYear = new ArrayList<>();

        for (Student fYear : students){
            if (fYear.getYear() == Level.FOURTH || fYear.getYear() == Level.THIRD){
                fourthAndThirdYear.add(fYear);
            }
        }
        Course course2 = new Course(fourthAndThirdYear, lecturer2);
        System.out.println(course2);



        List<Student> fourthYearStudentVowNames = new ArrayList<>();
        //the stream
        List<Student> vowelName = students
                    .stream()
                .filter( s -> s.getName().toLowerCase().startsWith("a")
                        || s.getName().toLowerCase().startsWith("e") || s.getName().toLowerCase().startsWith("i")
                        || s.getName().toLowerCase().startsWith("o") || s.getName().toLowerCase().startsWith("u"))
                . collect(Collectors.toList());

            vowelName.forEach( s -> System.out.println(s.getName()));
    }


    private static void printStudent(List<Student> students) {
        System.out.println(students);
    }


}
