package  io.turntabl.university;

public class Lecturer {
    private String name;
    private LectCourses courseOfLec;

    public Lecturer(String name, LectCourses courseOfLec) {
        this.name = name;
        this.courseOfLec = courseOfLec;
    }

    public String getName() {
        return name;
    }

    public LectCourses getCourseOfLec() {
        return courseOfLec;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", courseOfLec=" + courseOfLec +
                '}';
    }
}
