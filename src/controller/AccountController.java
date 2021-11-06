package controller;

import model.CheckingAccount;
import model.SavingAccount;
import view.AccountView;

public class AccountController {
    private SavingAccount saving;
    private CheckingAccount checking;
    private AccountView view;
    private int accountType;
    private int accountOperation;

    public AccountController(SavingAccount saving, CheckingAccount checking, AccountView view) {
        this.saving = saving;
        this.checking = checking;
        this.view = view;
    }

    public void run() {
        view.welcomeMessage();

        do {
            accountType = view.selectAccountType();
            if (accountType != 0) {
                loginAccount( /* accountType */ );

                do {
                    accountOperation = view.selectOperation();
                    perform( /* accountOperation */ );
                } while (accountOperation != 0);
                view.logoutMessage();
            }
        } while (accountType != 0);
        
        view.byeMessage();
    }

    private void loginAccount() {
        if (accountType == 1)
            view.loginAccount(saving);
        else if (accountType == 2)
            view.loginAccount(checking);
    }

    private void perform() {
        if (accountOperation == 1)
            withdraw();
        else if (accountOperation == 2)
            deposit();
        else if (accountOperation == 3)
            statement();
    }

    private void withdraw() {
        if (accountType == 1)
            validateTransaction(saving.withdraw(view.withdraw(saving)));
        else if (accountType == 2)
            validateTransaction(checking.withdraw(view.withdraw(checking)));
    }

    private void deposit() {
        if (accountType == 1)
            validateTransaction(saving.deposit(view.deposit()));
        else if (accountType == 2)
            validateTransaction(checking.deposit(view.deposit()));
    }

    private void statement() {
        if (accountType == 1)
            view.statement(saving);
        else if (accountType == 2)
            view.statement(checking);
    }

    private void validateTransaction(boolean perform) {
        view.responseTransaction(perform);
    }
}
