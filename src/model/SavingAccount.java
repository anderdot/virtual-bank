package model;

public class SavingAccount extends Account {
    private double income;

    public SavingAccount() {
    }

    public SavingAccount(String accountNumber, int agency, double balance,
                         double income) {
        setAccountNumber(accountNumber);
        setAgency(agency);
        setBalance(balance);
        setIncome(income);
    }

    public double getIncome() {
        return this.income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
