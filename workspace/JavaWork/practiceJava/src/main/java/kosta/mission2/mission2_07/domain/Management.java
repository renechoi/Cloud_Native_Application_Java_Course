package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.ui.InputView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Management {

    public static final String ADDITION = "추가할";
    public static final String SEARCH = "검색할";
    public static final String UPDATE_FROM = "수정할";
    public static final String UPDATE_TO = "수정후";
    public static final String DELETE = "삭제할";

    List<Contact> contacts = new ArrayList<>();

    public void addInfo(InputView inputView) {
        contacts.add(
                new Contact(inputView.getName(ADDITION),
                        inputView.getNumber(),
                        LocalDate.of(inputView.getDobYear(), inputView.getDobMonth(), inputView.getDobDate())));
    }

    public void printInfoAll() {
        if (contacts.isEmpty()) {
            System.out.println("contacts is empty!");
            return;
        }
        for (Contact contact : contacts) {
            contact.printContactInfo();
        }
    }

    public void printInfoByName(InputView inputView) {
        String nameRequested = inputView.getName(SEARCH);
        getContact(nameRequested).printContactInfo();
    }

    public void update(InputView inputView) {
        String nameFrom = inputView.getName(UPDATE_FROM);
        String nameTo = inputView.getName(UPDATE_TO);

        getContact(nameFrom).setName(nameTo);
    }

    public void delete(InputView inputView) {
        String nameToBeDeleted = inputView.getName(DELETE);

        contacts.remove(getContact(nameToBeDeleted));
    }

    private Contact getContact(String nameFrom) {
        return contacts.stream()
                .filter(c -> c.getName().equals(nameFrom))
                .findFirst()
                .orElseThrow(() -> new InvalidContactException(InvalidContactException.CONTACT_NOT_FOUND));
    }
}
