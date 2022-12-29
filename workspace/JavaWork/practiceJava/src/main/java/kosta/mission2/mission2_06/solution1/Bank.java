package kosta.mission2.mission2_06.solution1;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    static Account account;
    static ArrayList<Account> accounts = new ArrayList<>();

    public void handleCommand(int command) {
        System.out.println(Arrays.toString(Command.values()));

        account = Arrays.stream(Command.values())
                .filter(v -> v.getCommand() == command)
                .findFirst()
                .orElseThrow(IllegalArgumentException::new)
                .getAccount();
    }

    public static Account createAccount() {
        accounts.add(new Account());
        return account;
    }

    public Account viewAllAccounts() {
        return account;
    }

    public Account viewAccount() {
        return account;
    }

    public Account deposit() {
        return account;
    }

    public Account withdraw() {
        return account;
    }


    enum Command {
        CREATE(1, createAccount()),
        VIEW_ALL(2, viewAllAccounts()),
        VIEW_ACCOUNT(3, viewAccount()),
        DEPOSIT(4, deposit()),
        WITHDRAW(5, withdraw());

        private final int command;
        private final Account account;

        Command(int command, Account account) {
            this.command = command;
            this.account = account;
        }

        public int getCommand() {
            return command;
        }

        public Account getAccount() {
            return account;
        }

    }

}

