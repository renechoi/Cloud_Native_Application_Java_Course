package kosta.mission2.mission2_07.mission2_07_2.domain.contact;

import kosta.mission2.mission2_07.mission2_07_2.ui.outputView.printAction.PrintAction;
import kosta.mission2.mission2_07.mission2_07_2.ui.outputView.printAction.PrintGeneralContact;

import java.io.Serializable;
import java.time.LocalDate;

public class ContactGeneral implements Serializable {
    private String type;
    private String name;
    private String phoneNumber;
    private LocalDate dob;
    PrintAction printAction;

    ContactGeneral() {
    }

    public ContactGeneral(String type, String name, String phoneNumber, LocalDate dob) {
        this.type = type;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.dob = dob;
    }

    public void printContactInfo() {
        this.printAction = new PrintGeneralContact(type, name, phoneNumber, dob);
        printAction.print();
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }
}
