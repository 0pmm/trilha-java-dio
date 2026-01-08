package bank.clients;

public class SavingsBalance extends Account {
    @Override
    public void printExtract() {    
        System.out.println("Savings Account");
        System.out.println("Agency: " + getAgency() + " Number: " + getNumber());
        System.out.println("--------------------");
        System.out.println("Balance: " + getBalance());
    };
}
