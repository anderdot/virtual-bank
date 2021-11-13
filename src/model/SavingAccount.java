package model;

public class SavingAccount extends Account {
    private double income;

    public SavingAccount() {
        setIncome(4.57);
    }

    // public SavingAccount(String accountNumber, int agency, double balance,
    //                      double income) {
    //     setAccountNumber(accountNumber);
    //     setAgency(agency);
    //     setBalance(balance);
    //     setIncome(income);
    // }

    public double calculateIncome() {
        return getBalance() * getIncome() / 100;
    }

    public double calculateBalance() {
        return calculateIncome() + getBalance();
    }

    public double getIncome() {
        return this.income;
    }

    private void setIncome(double income) {
        this.income = income;
    }
}
