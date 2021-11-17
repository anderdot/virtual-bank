package view;

import java.util.Scanner;

import model.CheckingAccount;
import model.SavingAccount;

public class AccountView {
    Scanner scanner = new Scanner(System.in);

    public void welcomeMessage() {
        System.out.println("\nSeja bem vindo ao seu Banco Virtual!\n");
    }

    public void byeMessage() {
        System.out.println("Agradecemos pela preferência! Volte sempre ♥");
        scanner.close();
    }

    public void logoutMessage() {
        System.out.println("Conta desconectada.\n");
    }

    public void responseTransaction(boolean transaction) {
        System.out.println(transaction ? "Transação concluída!\n" : "Houve um erro, tente novamente.\n");
    }

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

    public double withdraw(SavingAccount saving) {
        System.out.printf("Saldo atual: R$ %.2f\n", saving.getBalance());
        return Double.parseDouble(generateMenu("Digite o valor a sacar."));
    }

    public double withdraw(CheckingAccount checking) {
        System.out.printf("Saldo atual: R$ %.2f\n", checking.getBalance());
        System.out.printf("Limite: R$ %.2f\n", checking.getBalanceLimit());
        return Double.parseDouble(generateMenu("Digite o valor a sacar."));
    }

    public double deposit() {
        return Float.parseFloat(generateMenu("Digite o valor a depositar."));
    }

    public void statement(SavingAccount saving) {
        System.out.println("Agência: " + saving.getAgency());
        System.out.println("Nº da Conta: " + saving.getAccountNumber());
        System.out.printf ("\nSaldo: R$ %.2f\n", saving.getBalance());
        System.out.println("Rendimento de: " + saving.getIncome() + "% ao ano.");
        System.out.printf ("Total ao fim de 12 meses: R$ %.2f\n", saving.calculateIncome());
        System.out.printf ("Saldo total: R$ %.2f\n\n", saving.calculateBalance());
    }

    public void statement(CheckingAccount checking) {
        System.out.println("Agência: " + checking.getAgency());
        System.out.println("Nº da Conta: " + checking.getAccountNumber());
        System.out.printf ("\nSaldo: R$ %.2f\n", checking.getBalance());
        System.out.printf ("Limite: R$ %.2f\n", checking.getBalanceLimit());
        System.out.println("juros de: " + checking.getMonthlyFee() + "% ao mês.");
        System.out.printf ("Total desse mês: R$ %.2f\n\n", checking.calculateMonthlyFee());
    }

    public int selectAccountType() {
        String[] menus = { "Conta Poupança", "Conta Corrente" };
        return generateMenu("Selecione o tipo de conta.", menus);
    }

    public int selectOperation() {
        String[] menus = { "Saque", "Depósito", "Extrato" };
        return generateMenu("Selecione a operação.", menus);
    }

    private String generateMenu(String tittle) {
        System.out.println(tittle);
        return getInput();
    }

    private int generateMenu(String tittle, String[] options) {
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
            System.out.print(first ? "" : "Digite uma opção valida!");
            first = false;
            input = Integer.parseInt(getInput());
        } while (input < 0 && input > options);

        return input;
    }

    private String getInput() {
        System.out.print("> ");
        String text = scanner.nextLine();
        System.out.println();
        return text;
    }
}
