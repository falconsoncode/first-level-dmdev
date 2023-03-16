package com.dmdev.cs.homework.homework_8;

import java.util.List;

class StudentInfo {
    private double avgMark;
    private List<Student> sortedStudents;

    public StudentInfo(double avgMark, List<Student> sortedStudents) {
        this.avgMark = avgMark;
        this.sortedStudents = sortedStudents;
    }

    public double getAvgMark() {
        return avgMark;
    }

    public List<Student> getSortedStudents() {
        return sortedStudents;
    }

    @Override
    public String toString() {
        return "Avg mark: " + avgMark + ", Sorted students: " + sortedStudents;
    }
}