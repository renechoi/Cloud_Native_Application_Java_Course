package kosta.mission2.Mission2_10.bank.customer;

import kosta.mission2.Mission2_10.bank.ui.OutputView;

public class NotEnoughBalanceException extends IllegalArgumentException {
    private static final String NOT_ENOUGH_BALANCE_EXCEPTION = "잔액이 부족합니다!";

    public NotEnoughBalanceException() {
        super(NOT_ENOUGH_BALANCE_EXCEPTION);
        OutputView.consolePrint(NOT_ENOUGH_BALANCE_EXCEPTION);
    }
}
