package model;

public class CheckingAccount extends Account {
    private double balanceLimit;
    private double monthlyFee; // taxa mensal

    public CheckingAccount() {
        setBalanceLimit(1000);
        setMonthlyFee(0.78);
    }

    @Override
    public boolean withdraw(double value) {
        if (value > 0 && getBalance() + getBalanceLimit() - value >= 0) {
            setBalance(getBalance() - value);
            return true;
        }

        return false;
    }

    public double calculateMonthlyFee() {
        double fee = getBalance() * getMonthlyFee() / 100;
        return fee >= 0 ? fee : fee * -1; //inverte
    }

    public double getBalanceLimit() {
        return getBalance() >= 0 ? this.balanceLimit : 0;
    }

    public void setBalanceLimit(double balanceLimit) {
        this.balanceLimit = balanceLimit;
    }

    public double getMonthlyFee() {
        return getBalance() > 0 ? this.monthlyFee : this.monthlyFee * 1.50;
    }

    public void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }
}
