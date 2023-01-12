package kosta.mission2.mission2_07.domain.manager;

import kosta.mission2.mission2_07.domain.Result;
import kosta.mission2.mission2_07.domain.command.Command;
import kosta.mission2.mission2_07.domain.command.SortCommand;
import kosta.mission2.mission2_07.domain.command.SortCommandReader;
import kosta.mission2.mission2_07.domain.command.SystemCommandReader;
import kosta.mission2.mission2_07.domain.contact.ContactGeneral;
import kosta.mission2.mission2_07.domain.contact.ContactUniversity;
import kosta.mission2.mission2_07.ui.InputView;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Manager implements Serializable {

    public static final String ADDITION = "추가할";
    public static final String SEARCH = "검색할";
    public static final String UPDATE_FROM = "수정할";
    public static final String UPDATE_TO = "수정후";
    public static final String DELETE = "삭제할";

    List<ContactGeneral> contacts = new ArrayList<>();

    public Result addInfo() {
        try {
            String type = InputView.getType();
            String name = InputView.getName(ADDITION);
            String number = InputView.getPhoneNumber();
            LocalDate localDate = LocalDate.of(InputView.getDobYear(), InputView.getDobMonth(), InputView.getDobDate());
            switch (type) {
                case "일반" -> contacts.add(new ContactGeneral(type, name, number, localDate));
                case "동창" -> contacts.add(new ContactUniversity(type, name, number, localDate));
            }
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result printInfoAll() {
        try {
            if (contacts.isEmpty()) {
                System.out.println("contacts is empty!");
                return new Result(true, false);
            }
            for (ContactGeneral contact : contacts) {
                contact.printContactInfo();
            }
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result printInfoByName() {
        try {
            String nameRequested = InputView.getName(SEARCH);
            getContact(nameRequested).printContactInfo();
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result update() {
        try {
            String nameFrom = InputView.getName(UPDATE_FROM);
            String nameTo = InputView.getName(UPDATE_TO);
            getContact(nameFrom).setName(nameTo);
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result delete() {
        try {
            String nameToBeDeleted = InputView.getName(DELETE);
            contacts.remove(getContact(nameToBeDeleted));
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result handleSortRequest(Manager manager) {
        try {
            SortCommandReader sortCommandReader = new SortCommandReader();
            Command command = sortCommandReader.parseCommand(InputView.getSortCommand());
            command.handleCommand(manager);
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.CRUD_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    // TODO : sort 작업만 별도로 수행하는 (내부) 클래스 구현 고려 !
    public Result sortByType() {
        try {
            contacts.sort(Comparator.comparing(ContactGeneral::getType));
        } catch(RuntimeException e){
        throw new NotSupportOperationException(NotSupportOperationException.SORT_NOT_SUPPORT_OPERATION_EXCEPTION);

        }
        return new Result(true, false);
    }

    public Result sortByName() {
        try {
            contacts.sort(Comparator.comparing(ContactGeneral::getName));
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.SORT_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result sortByNumber() {
        try {
            contacts.sort(Comparator.comparing(ContactGeneral::getPhoneNumber));
        } catch (RuntimeException e) {
            throw new NotSupportOperationException(NotSupportOperationException.SORT_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result sortByDob() {
        try {
            contacts.sort(Comparator.comparing(ContactGeneral::getDob));
        } catch (RuntimeException e){
            throw new NotSupportOperationException(NotSupportOperationException.SORT_NOT_SUPPORT_OPERATION_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result saveFile() {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("contactInfoVer1.btc"));
            objectOutputStream.writeObject(contacts);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new NotSupportOperationException(NotSupportOperationException.FILE_SAVING_IO_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result loadFile() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("contactInfoVer1.btc"));
            this.contacts = (List<ContactGeneral>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new NotSupportOperationException(NotSupportOperationException.FILE_LOADING_IO_EXCEPTION);
        }
        return new Result(true, false);
    }

    public Result quit() {
        System.out.println("quit!");
        return new Result(false, true);
    }

    private ContactGeneral getContact(String nameFrom) {
        return contacts.stream()
                .filter(contact -> contact.getName().equals(nameFrom))
                .findFirst()
                .orElseThrow(() -> new InvalidContactException(InvalidContactException.CONTACT_NOT_FOUND));
    }
}

