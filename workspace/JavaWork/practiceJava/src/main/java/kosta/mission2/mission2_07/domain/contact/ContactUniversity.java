package kosta.mission2.mission2_07.domain.contact;

import kosta.mission2.mission2_07.ui.InputView;
import kosta.mission2.mission2_07.ui.printAction.PrintGeneralContact;
import kosta.mission2.mission2_07.ui.printAction.PrintUniversityContact;

import java.time.LocalDate;

public class ContactUniversity extends ContactGeneral {

    private String major;
    private String studentId;

    public ContactUniversity(String type, String name, String number, LocalDate dob) {
        super(type, name, number, dob);
        this.major = InputView.getMajor();
        this.studentId = InputView.getStudentId();
        this.printAction = new PrintUniversityContact(type, name, number, dob, major, studentId);
    }

}
