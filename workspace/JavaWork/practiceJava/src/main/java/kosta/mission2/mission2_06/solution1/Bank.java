package kosta.mission2.mission2_06.solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    static Account account;
    static List<Account> accounts = new ArrayList<>();

    public void handleCommand(int userInput) {

        while(true){
            Command command = Command.of(userInput);

            if (command.command==6){
                break;
            }
            command.bankAction();
        }

    }

    public static Account createAccount() {
        InputView inputView = new InputView();
        accounts.add(new Account(inputView.getAccountName()));
        return account;
    }

    public static Account viewAllAccounts() {
        for (Account account : accounts) {
            System.out.println(account.accountName);
        }
        return account;
    }

    public static Account viewAccount() {
        InputView inputView = new InputView();
        String accountName = inputView.getAccountName();
        System.out.println("viewAccount");
        return account;
    }

    public static Account deposit() {
        System.out.println("deposit");
        return account;
    }

    public static Account withdraw() {
        System.out.println("withdraw");
        return account;
    }


    enum Command {

        CREATE_ACCOUNT(1) {
            @Override
            public void bankAction() {
                createAccount();
            }
        },
        VIEW_ALL(2) {
            @Override
            public void bankAction() {
                viewAllAccounts();
            }

        },
        VIEW_ACCOUNT(3) {
            @Override
            public void bankAction() {
                viewAccount();
            }
        },
        DEPOSIT(4) {
            @Override
            public void bankAction() {
                deposit();
            }
        },
        WITHDRAW(5) {
            @Override
            public void bankAction() {
                withdraw();
            }
        },
        QUIT(6) {
            @Override
            public void bankAction() {
            }
        };

        private final int command;

        Command(int userChoice) {
            this.command = userChoice;
        }


        public static Command of(int userChoice) {
            return Arrays.stream(values())
                    .filter(v -> v.command == userChoice)
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);
        }
        public abstract void bankAction();
    }

}

