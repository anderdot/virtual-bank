package view;

import java.util.Scanner;

import model.CheckingAccount;
import model.SavingAccount;

public class AccountView {

    Scanner scanner = new Scanner(System.in);

    private int generateMenu(String[] options) {
        System.out.println();
        for (int i = 0; i < options.length; i++) {
            System.out.println(" [" + (i + 1) + "] " + options[i]);
        }
        System.out.println(" [0] Sair\n");
        int option = validateInput(options.length + 1);

        System.out.println("Você selecionou " + options[option] + "\n");
        return option;
    }

    private int validateInput(int options) {
        int input;
        do {
            input = Integer.parseInt(getInput());
        } while (input < 0 && input > options);

        return input;
    }

    private String getInput() {
        System.out.print("> ");
        return scanner.next();
    }

    public void loginAccount(Object account) {
        // Class<?> cast = account.getClass();
        // for(Field field : cast.getDeclaredFields()) {
        //     System.out.println(field.getName());
        // }
        if (account.getClass().isInstance(new SavingAccount())) {
            System.out.println("Número da Conta: ");
            ((SavingAccount) account).setAccountNumber(getInput());

            System.out.println("Agência: ");
            ((SavingAccount) account).setAgency(Integer.parseInt(getInput()));
        } else {
            System.out.println("Número da Conta: ");
            ((CheckingAccount) account).setAccountNumber(getInput());

            System.out.println("Agência: ");
            ((CheckingAccount) account).setAgency(Integer.parseInt(getInput()));
        }
    }

    public void switchOperation(Object account) {
        System.out.println("vai fazer oq?");
        String[] menus = { "Depositar", "Sacar", "Extrato" };
        generateMenu(menus);
    }

    public int selectAccountType() {
        String[] menus = { "Conta Poupança", "Conta Corrente" };
        return generateMenu(menus);
    }

    public void welcome() {
        System.out.println("Seja bem vindo ao seu Banco Virtual!");
    }

    public void byeMessage() {
        System.out.println("Agradecemos pela preferência!");
    }
}
