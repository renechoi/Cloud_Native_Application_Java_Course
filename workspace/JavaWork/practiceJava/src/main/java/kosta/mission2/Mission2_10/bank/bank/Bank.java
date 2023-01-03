package kosta.mission2.Mission2_10.bank.bank;

import kosta.mission2.Mission2_10.bank.ui.InputView;
import kosta.mission2.Mission2_10.bank.ui.OutputView;
import kosta.mission2.Mission2_10.bank.customer.Account;
import kosta.mission2.Mission2_10.bank.customer.Customer;

import java.util.Arrays;
import java.util.Objects;

public class Bank {

    private final int CUSTOMER_LIMIT = 10;
    private final Customer[] CUSTOMERS = new Customer[CUSTOMER_LIMIT];
    private static int CUSTOMER_NUMBER = 0;

    public Bank() {
    }

    public void addCustomer() {
        CUSTOMERS[CUSTOMER_NUMBER++] = new Customer();
    }

    public void deposit() {
        Customer customer = getCustomer();
        Account account = customer.getAccount();

        account.deposit(InputView.getBalance());
    }

    public void withdraw() {
        Customer customer = getCustomer();
        Account account = customer.getAccount();

        account.withdraw(InputView.getBalance());
    }

    public void printCustomerInfo() {
        OutputView.consolePrint(getCustomer());
    }

    public void printAllCustomerInfo() {
        Arrays.stream(CUSTOMERS)
                .filter(Objects::nonNull)
                .map(Customer::toString)
                .forEach(System.out::println);
    }

    public Customer getCustomer() {
        String id = InputView.getId();
        return Arrays.stream(CUSTOMERS)
                .filter(v -> v != null && v.getId().equals(id))
                .findFirst()
                .orElseThrow(IdNotFoundException::new);
    }

    public static int getCustomerNumber() {
        return CUSTOMER_NUMBER;
    }
}
