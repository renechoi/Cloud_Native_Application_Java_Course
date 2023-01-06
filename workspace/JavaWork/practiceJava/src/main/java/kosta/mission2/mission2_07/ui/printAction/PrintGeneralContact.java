package kosta.mission2.mission2_07.ui.printAction;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrintGeneralContact implements PrintAction{

    private String type;
    private String name;
    private String number;
    private String dobFormatted;

    public PrintGeneralContact() {
    }

    public PrintGeneralContact(String type, String name, String number, LocalDate dob) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.dobFormatted = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(dob);
    }

    @Override
    public void print() {
        System.out.printf("\n[%s] 이름: %s 전화번호: %s 생년월일: %s\n", type, name, number, dobFormatted);
    }

}
