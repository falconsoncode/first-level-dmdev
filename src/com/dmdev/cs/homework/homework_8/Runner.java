package com.dmdev.cs.homework.homework_8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ivan", "Ivanov", 1, Arrays.asList(5, 4, 5)),
                new Student("Petr", "Petrov", 2, Arrays.asList(4, 3, 5, 4)),
                new Student("Sergey", "Sidorov", 1, Arrays.asList(3, 3, 3)),
                new Student("Dmitry", "Dmitrov", 3, Arrays.asList(5, 5, 5)),
                new Student("Alexey", "Alexeev", 2, Arrays.asList(4, 5, 4))
        );

        Map<Integer, StudentInfo> result = students.stream()
                .collect(Collectors.groupingBy(Student::getCourse,
                        Collectors.collectingAndThen(Collectors.toList(),
                                studentsOfCourse -> {
                                    double avgMark = studentsOfCourse.stream()
                                            .flatMap(student -> student.getMarks().stream())
                                            .mapToInt(Integer::intValue)
                                            .average()
                                            .orElse(Double.NaN);
                                    List<Student> sortedStudents = studentsOfCourse.stream()
                                            .filter(student -> student.getMarks().size() > 3)
                                            .sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName))
                                            .map(student -> new Student(student.getFirstName(), student.getLastName(), student.getCourse(), null))
                                            .collect(Collectors.toList());
                                    return new StudentInfo(avgMark, sortedStudents);
                                })));

        Map<Integer, StudentInfo> sortedResult = new TreeMap<>(result);

        sortedResult.forEach((k, v) -> {
            System.out.println(k);
            System.out.println(v.toString());
        });
    }
}

