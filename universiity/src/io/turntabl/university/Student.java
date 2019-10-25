package io.turntabl.university;

public class Student {
    private String name;
    private int stdId;
    private Level year;

    public Student(String name, int stdId, Level year) {
        this.name = name;
        this.stdId = stdId;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getStdId() {
        return stdId;
    }

    public Level getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stdId=" + stdId +
                ", year=" + year +
                '}';
    }
}


