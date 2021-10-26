package model;

public abstract class Account {
    private String accountNumber;
    private int agency;
    private double balance;

    public Account() {
        this.balance = 200;
    }

    public void sacar(double valor) {
        System.out.println("metodo da classe pai");
    }

    public Account(String accountNumber, int agency, double balance) {
        this.accountNumber = accountNumber;
        this.agency = agency;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
