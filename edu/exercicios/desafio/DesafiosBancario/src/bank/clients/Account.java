package bank.clients;

import bank.gear.GenericAccount;

public abstract class Account implements GenericAccount {
    protected double balance;
    protected int agency;
    protected int number;
    private static int next = 1;


    public Account() {
        this.agency = 1;
        this.number = next++;
        this.balance = 0;
    };

    public int getAgency() {
        return agency;
    }
    public double getBalance() {
        return balance;
    }
    public int getNumber() {
        return number;
    }
    public void setAgency(int agency) {
        this.agency = agency;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void withdrawn(double value) {
        if(balance == 0 || (balance - value < 0))
            System.out.println("No balance avaliable");
        else
            setBalance(getBalance() - value);
    }
    @Override
    public void deposit(double value) {
        setBalance(getBalance() + value);
    }
    @Override
    public void transfer(double value, GenericAccount account) {
        if(balance == 0 || (balance - value < 0))
            System.out.println("No balance avaliable");
        else {
            withdrawn(value);
            account.deposit(value);
        }
    }

    public void printExtract() {};
}
