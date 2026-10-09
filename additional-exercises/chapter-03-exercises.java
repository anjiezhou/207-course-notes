class abstract Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        // ...
    }

    public abstract boolean withdraw(double amount)
}

interface InterestBearing {
    void addInterest()
}

class ChequingAccount extends Account {
    private double overdraftLimit;

    public boolean withdraw(double amount) {
        // ...
    }
}

class SavingsAccount extends Account implements InterestBearing {
    private double rate;

    public boolean withdraw(double amount) {
        // ...
    }

    public void addInterest() {
        // ...
    }
}