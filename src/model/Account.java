package model;

public abstract class Account {
    private String accountNumber;
    private int agency;
    private double balance;

    public void deposit(double value) {
        setBalance(getBalance() + value);
    }

    public void withdraw(double value) {
        setBalance(getBalance() - value);
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

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}
