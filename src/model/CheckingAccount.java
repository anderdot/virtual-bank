package model;

public class CheckingAccount extends Account {
    private double balanceLimit;
    private double monthlyFee; // taxa mensal

    public CheckingAccount() {
    }

    @Override
    public void sacar(double valor) {
        System.out.println("metodo da classe filha");
    }

    public CheckingAccount(double balanceLimit, double monthlyFee) {
        this.balanceLimit = balanceLimit;
        this.monthlyFee = monthlyFee;
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
