package kosta.toyMission.contact.domain.contact;

import java.time.LocalDate;

public class ContactJob extends ContactGeneral {
    public ContactJob() {
    }

    public ContactJob(String type, String name, String number, LocalDate dob) {
        super(type, name, number, dob);
    }
}
