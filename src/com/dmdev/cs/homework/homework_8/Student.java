package com.dmdev.cs.homework.homework_8;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int course;
    private List<Integer> marks;

    public Student(String firstName, String lastName, int course, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCourse() {
        return course;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
