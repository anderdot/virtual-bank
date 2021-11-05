package model;

public class CheckingAccount extends Account {
    private double balanceLimit;
    private double monthlyFee; // taxa mensal

    public CheckingAccount() {

    }

    public CheckingAccount(String accountNumber, int agency, double balance, 
                           double balanceLimit, double monthlyFee) {
        setAccountNumber(accountNumber);
        setAgency(agency);
        setBalance(balance);
        setBalanceLimit(balanceLimit);
        setMonthlyFee(monthlyFee);
    }

    public double getBalanceLimit() {
        return this.balanceLimit;
    }

    public void setBalanceLimit(double balanceLimit) {
        this.balanceLimit = balanceLimit;
    }

    public double getMonthlyFee() {
        return this.monthlyFee;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
