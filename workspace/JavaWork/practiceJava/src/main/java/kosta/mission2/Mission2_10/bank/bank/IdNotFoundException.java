package kosta.mission2.Mission2_10.bank.bank;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class IdNotFoundException extends IllegalArgumentException {
    private static final String ID_NOT_FOUND_EXCEPTION= "그런 아이디 없습니다!";

    public IdNotFoundException() {
        super(ID_NOT_FOUND_EXCEPTION);
        OutputView.consolePrint(ID_NOT_FOUND_EXCEPTION);
    }
}
