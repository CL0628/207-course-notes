// SavingsAccount, ChequingAccount extends account
// SavingsAccount implements interestbearing

interface InterestBearing {
    void addInterest();
}

abstract class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        // ...
    }

    public abstract boolean withdraw(double amount);
}

class ChequingAccount extends Account {
    private double overdraftLimit;

    public ChequingAccount(double balance) {
        super(balance);
    }

    public boolean withdraw(double amount) {
        // ...
        return false;
    }
}

class SavingsAccount extends Account implements InterestBearing {

    private double rate;

    public SavingsAccount(double balance){
        super(balance);
    }

    public boolean withdraw(double amount) {
        // ...
        return false;
    }

    public void addInterest() {
        // ....
    }

}