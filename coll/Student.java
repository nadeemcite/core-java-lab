package coll;

public class Student implements Comparable<Student> {
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    // new Student(1,"nadeem")

    @Override
    public String toString() {
        return this.roll + " - " + this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.roll == ((Student) obj).roll;
    }

    @Override
    public int hashCode() {
        return this.roll;
    }

    @Override
    public int compareTo(Student o) {

        return -this.name.toLowerCase().compareTo(o.name.toLowerCase());
    }
}
