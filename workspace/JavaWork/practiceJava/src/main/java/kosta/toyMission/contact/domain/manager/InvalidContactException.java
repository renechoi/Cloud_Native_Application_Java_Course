package kosta.toyMission.contact.domain.manager;

public class InvalidContactException extends IllegalArgumentException{
    public static final String CONTACT_NOT_FOUND= "해당하는 contact가 없습니다!";

    public InvalidContactException(String message){
        super(message);
    }
}
