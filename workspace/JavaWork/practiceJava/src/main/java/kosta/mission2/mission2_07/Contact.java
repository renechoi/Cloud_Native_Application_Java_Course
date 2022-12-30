package kosta.mission2.mission2_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String number;
    private LocalDate dob;
    private String dobFormatted;


    Contact(){
    }

    public Contact(String name, String number, LocalDate dob) {
        this.name = name;
        this.number = number;
        this.dob = dob;
        this.dobFormatted = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일").format(dob);
    }

    public String getFormattedDob(){
        return this.dobFormatted;
    }

    public void printContactInfo() {
        System.out.println( "Contact{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", dob=" + dob +
                ", dobFormatted='" + dobFormatted + '\'' +
                '}');
    }
}
