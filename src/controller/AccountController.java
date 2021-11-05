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
        
        switch (AccountType) {
            case 1:
                view.loginAccount(saving);
                break;
            case 2:
                view.loginAccount(checking);
                break;
            default: view.byeMessage();
                break;
        }
        // view.switchOperation(this.AccountType == 1 ? saving : checking);
    }
}
