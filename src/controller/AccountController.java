package controller;

import model.CheckingAccount;
import model.SavingAccount;
import view.AccountView;

public class AccountController {
    private SavingAccount saving;
    private CheckingAccount checking;
    private AccountView view;
    private int AccountType;

    public AccountController(SavingAccount saving, CheckingAccount checking, AccountView view) {
        this.saving = saving;
        this.checking = checking;
        this.view = view;
    }

    public void run() {
        view.welcome();
        this.AccountType = view.selectAccountType();
        if (this.AccountType == 0) {
            view.byeMessage();
        }
        view.loginAccount(this.AccountType == 1 ? saving : checking);
        view.switchOperation(this.AccountType == 1 ? saving : checking);
    }
}
