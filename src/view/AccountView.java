package view;

import java.util.Scanner;

import model.CheckingAccount;
import model.SavingAccount;

public class AccountView {
    public void loginAccount(SavingAccount account) {
        account.setAccountNumber(generateMenu("Número da conta: "));

        int agencyNumber = Integer.parseInt(generateMenu("Número da agência: "));
        account.setAgency(agencyNumber);
    }

    public void loginAccount(CheckingAccount account) {
        account.setAccountNumber(generateMenu("Número da conta: "));

        int agencyNumber = Integer.parseInt(generateMenu("Número da agência: "));
        account.setAgency(agencyNumber);
    }

    // public void switchOperation(Object account) {
    //     String[] menus = { "Depositar", "Sacar", "Extrato" };
    //     generateMenu("Selecione a operação.", menus);
    // }

    public int selectAccountType() {
        String[] menus = { "Conta Poupança", "Conta Corrente" };
        return generateMenu("Selecione o tipo de conta.", menus);
    }

    public void welcome() {
        System.out.println("Seja bem vindo ao seu Banco Virtual!");
    }

    public void byeMessage() {
        System.out.println("Agradecemos pela preferência! Volte sempre ♥");
    }

    private String generateMenu(String tittle) {
        System.out.println(tittle);
        return getInput();
    }

    private int generateMenu(String tittle, String[] options) {
        System.out.println();
        for (int i = 0; i < options.length; i++) {
            System.out.println(" [" + (i + 1) + "] " + options[i]);
        }
        System.out.println(" [0] Sair\n");
        System.out.println(tittle);
        int option = validateInput(options.length + 1);
        return option;
    }

    private int validateInput(int options) {
        boolean first = true;
        int input;
        do {
            System.out.println(first ? "" : "Digite uma opção valida!");
            first = false;
            input = Integer.parseInt(getInput());
        } while (input < 0 && input > options);

        return input;
    }

    private String getInput() {
        System.out.print("> ");
        String text = new Scanner(System.in).nextLine();
        return text;
    }

    private void separator() {
        // System.out.println("╚══════════════════════════════════════════╝");
        // System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("--------------------------------------");
    }
}
