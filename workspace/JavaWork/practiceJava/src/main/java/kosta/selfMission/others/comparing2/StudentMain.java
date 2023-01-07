package kosta.selfMission.others.comparing2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

class AscendingStudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getId(), student1.getId());
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(5, "kim"),
                new Student(3, "lee"),
                new Student(4, "choi"));

        List<Student> studentList = new ArrayList<>(students);

        Collections.sort(studentList, new DescendingStudentComparator());
        System.out.println(studentList);

        studentList.sort(new AscendingStudentComparator());

        System.out.println(studentList);

    }
}
