package kosta.mission2.Mission2_10.bank.customer;

import kosta.mission2.Mission2_10.bank.bank.Bank;
import kosta.mission2.Mission2_10.bank.ui.InputView;
import kosta.mission2.Mission2_10.bank.ui.OutputView;

import java.util.Objects;

public class Customer {

    private final String id;
    private final String name;
    private final Account account;

    public Customer() {
        this.id = requestId();
        this.name = requestName();
        this.account = new Account(id, requestAmount());
        OutputView.consolePrint(OutputView.ADD_ACCOUNT_SUCCESS);
    }

    private String requestId() {
        return validate(InputView.getId());
    }

    private String requestName() {
        return validate(InputView.getName());
    }

    private Long requestAmount() {
        return validate(InputView.getBalance());
    }

    private Long validate(Long userInput) {
        if (userInput < 0) {
            try {
                throw new InvalidCustomerInputException(InvalidCustomerInputException.INVALID_NUMBER_UNDER_ZERO);
            } catch (InvalidCustomerInputException ignored) {
            }
        }
        return userInput;
    }

    private String validate(String userInput) {
        try {
            validateNullOrEmpty(userInput);
            validateProperWord(userInput);
        } catch (InvalidCustomerInputException ignored) {
        }
        return userInput;
    }

    private void validateNullOrEmpty(String userInput) throws InvalidCustomerInputException {
        if (Objects.isNull(userInput) || userInput.isEmpty()) {
            throw new InvalidCustomerInputException(InvalidCustomerInputException.NULL_OR_EMPTY_EXCEPTION);
        }
    }

    private void validateProperWord(String userInput) throws InvalidCustomerInputException {
        if (!userInput.matches("[a-zA-z\\u3131-\\u314e|\\u314f-\\u3163|\\uac00-\\ud7a3]*")) {
            throw new InvalidCustomerInputException(InvalidCustomerInputException.INVALID_WORD_EXCEPTION);
        }
    }

    public String getId() {
        return id;
    }

    public Object getName() {
        return null;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return String.format("""
                        Customer Number: %d
                        id: %s
                        name: %s
                        account id: %s
                        account balance: %s    
                                                
                        %s
                                        """, Bank.getCustomerNumber(), id, name,
                account.getId(), account.getBalance(), "-".repeat(20));
    }

}
