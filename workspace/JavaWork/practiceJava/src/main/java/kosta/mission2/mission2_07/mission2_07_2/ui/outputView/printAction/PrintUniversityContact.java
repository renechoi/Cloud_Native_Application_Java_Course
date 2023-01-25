package kosta.mission2.mission2_07.mission2_07_2.ui.outputView.printAction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintUniversityContact implements PrintAction{

    private String type;
    private String name;
    private String number;
    private String dobFormatted;

    private String major;
    private String studentId;

    public PrintUniversityContact(String type, String name, String number, LocalDate dob, String major, String studentId) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.dobFormatted = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(dob);
        this.major = major;
        this.studentId = studentId;
    }

    @Override
    public void print() {
        System.out.printf("\n[%s %s %s] 이름: %s 전화번호: %s 생년월일: %s\n", type, major, studentId, name, number, dobFormatted);
    }
}
