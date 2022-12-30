package kosta.mission2.mission2_07.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String number;
    private LocalDate dob;
    private String dobFormatted;

    Contact() {
    }

    public Contact(String name, String number, LocalDate dob) {
        this.name = name;
        this.number = number;
        this.dob = dob;
        this.dobFormatted = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(dob);
    }

    public String getFormattedDob() {
        return this.dobFormatted;
    }

    public void printContactInfo() {
        System.out.printf("\n이름: %s 전화번호: %s 생년월일: %s\n\n", name, number, dobFormatted);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
