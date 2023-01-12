package kosta.mission2.mission2_07.domain.contact;

import kosta.mission2.mission2_07.ui.printAction.PrintAction;
import kosta.mission2.mission2_07.ui.printAction.PrintGeneralContact;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContactGeneral implements Serializable {
    private String type;
    private String name;
    private String number;
    private LocalDate dob;
    PrintAction printAction;

    ContactGeneral() {
    }

    public ContactGeneral(String type, String name, String number, LocalDate dob) {
        this.type = type;
        this.name = name;
        this.number = number;
        this.dob = dob;
    }

    public void printContactInfo() {
        this.printAction = new PrintGeneralContact(type, name, number, dob);
        printAction.print();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }
}
