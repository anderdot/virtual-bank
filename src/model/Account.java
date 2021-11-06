package model;

public abstract class Account {
    private String accountNumber;
    private int agency;
    private double balance;

    public boolean withdraw(double value) {
        if (getBalance() - value >= 0 && value > 0) {
            setBalance(getBalance() - value);
            return true;
        }
        
        return false;
    }

    public boolean deposit(double value) {
        if (value > 0) {
            setBalance(getBalance() + value);
            return true;
        }
        
        return false;
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
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
