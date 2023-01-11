package kosta.mission2.mission2_07.domain;

import kosta.mission2.mission2_07.domain.command.CommandSort;
import kosta.mission2.mission2_07.domain.contact.ContactGeneral;
import kosta.mission2.mission2_07.domain.contact.ContactUniversity;
import kosta.mission2.mission2_07.ui.InputView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Management {

    public static final String ADDITION = "추가할";
    public static final String SEARCH = "검색할";
    public static final String UPDATE_FROM = "수정할";
    public static final String UPDATE_TO = "수정후";
    public static final String DELETE = "삭제할";

    List<ContactGeneral> contacts = new ArrayList<>();

    public void addInfo() {

        String type = InputView.getType();
        String name = InputView.getName(ADDITION);
        String number = InputView.getNumber();
        LocalDate localDate = LocalDate.of(InputView.getDobYear(), InputView.getDobMonth(), InputView.getDobDate());

        switch (type) {
            case "일반" -> contacts.add(new ContactGeneral(type, name, number, localDate));
            case "동창" -> contacts.add(new ContactUniversity(type, name, number, localDate));
        }
    }

    public void printInfoAll() {
        if (contacts.isEmpty()) {
            System.out.println("contacts is empty!");
            return;
        }
        for (ContactGeneral contact : contacts) {
            contact.printContactInfo();
        }
    }

    public void printInfoByName() {
        String nameRequested = InputView.getName(SEARCH);
        getContact(nameRequested).printContactInfo();
    }

    public void update() {
        String nameFrom = InputView.getName(UPDATE_FROM);
        String nameTo = InputView.getName(UPDATE_TO);

        getContact(nameFrom).setName(nameTo);
    }

    public void delete() {
        String nameToBeDeleted = InputView.getName(DELETE);
        contacts.remove(getContact(nameToBeDeleted));
    }

    public void handleSortRequest(Management management) {
        CommandSort command = CommandSort.of(InputView.getSortCommand());
        command.sortAction(management);
    }

    public void sortByType() {
        contacts.sort(Comparator.comparing(ContactGeneral::getType));
    }

    public void sortByName() {
        contacts.sort(Comparator.comparing(ContactGeneral::getName));
    }

    public void sortByNumber() {
        contacts.sort(Comparator.comparing(ContactGeneral::getNumber));
    }

    public void sortByDob() {
        contacts.sort(Comparator.comparing(ContactGeneral::getDob));
    }

    private ContactGeneral getContact(String nameFrom) {
        return contacts.stream()
                .filter(c -> c.getName().equals(nameFrom))
                .findFirst()
                .orElseThrow(() -> new InvalidContactException(InvalidContactException.CONTACT_NOT_FOUND));
    }
}

// Sort Action에 대해 별도의 클래스를 만들어 관리하는 것에 대해 고민해보았다. 결과는... 놉.. ㅠㅠ
//class SortAction{
//    private void sortByType(List<ContactGeneral> contacts) {
//        contacts.sort(Comparator.comparing(ContactGeneral::getType));
//    }
//
//    private void sortByAge(List<ContactGeneral> contacts) {
//        contacts.sort(Comparator.comparing(ContactGeneral::getName));
//    }
//
//    private void sortByNumber(List<ContactGeneral> contacts) {
//        contacts.sort(Comparator.comparing(ContactGeneral::getNumber));
//    }
//
//    private void sortByDob(List<ContactGeneral> contacts) {
//        contacts.sort(Comparator.comparing(ContactGeneral::getDob));
//    }

