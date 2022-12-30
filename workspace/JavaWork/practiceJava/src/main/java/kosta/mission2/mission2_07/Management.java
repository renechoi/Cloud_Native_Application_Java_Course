package kosta.mission2.mission2_07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Management {

    List<Contact> contacts = new ArrayList<>();

    public void addInfo() {
        InputView inputView = new InputView();
        contacts.add(
                new Contact(inputView.getName(),
                        inputView.getNumber(),
                        LocalDate.of(inputView.getDobYear(), inputView.getDobMonth(), inputView.getDobDate())));
    }

    public void printInfoAll() {
        for (Contact contact : contacts) {
            contact.printContactInfo();
        }
    }

    public void printInfoByName() {
        InputView inputView = new InputView();

    }
}
