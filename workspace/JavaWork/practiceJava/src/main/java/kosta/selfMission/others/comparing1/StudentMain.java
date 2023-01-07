package kosta.selfMission.others.comparing1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1, "kim"),
                new Student(2,"lee"),
                new Student(3, "choi"));

        List<Student> studentList = new ArrayList<>(students);
        System.out.println(studentList);

//        Collections.sort(studentList); //method java.util.Collections.<T>sort(java.util.List<T>) is not applicable

        Collections.sort(studentList);
    }


}
