package ait.user.model;

public class Account {
    String iban;
    double balance;
    Person owner;

    public Account(String iban, double balance, Person owner) {
        this.iban = iban;
        this.balance = balance;
        this.owner = owner;
    }

    public String toString() {
        return iban + "\nOwner: " + owner.toString() + "\nbalance: " + balance;
    }
}

