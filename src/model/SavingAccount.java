package model;

public class SavingAccount extends Account {
    private double income;

    public SavingAccount() {
    }

    public SavingAccount(double income) {
        this.income = income;
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
