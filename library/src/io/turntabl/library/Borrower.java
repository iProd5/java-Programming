package io.turntabl.library;

public class Borrower {
    private String name;
    private int id;
    private String Date;
    private BorrowerType BorrowerType;

    public Borrower(String name, int id, String date, io.turntabl.library.BorrowerType borrowerType) {
        this.name = name;
        this.id = id;
        Date = date;
        BorrowerType = borrowerType;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return Date;
    }

    public io.turntabl.library.BorrowerType getBorrowerType() {
        return BorrowerType;
    }

    @Override
    public String toString() {
        return "Borrower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Date='" + Date + '\'' +
                ", BorrowerType=" + BorrowerType +
                '}';
    }
}
