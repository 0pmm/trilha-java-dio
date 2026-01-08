package bank.clients;


public class CurrentBalance extends Account{
    @Override
    public void printExtract() {
        System.out.println("Current Account");
        System.out.println("Agency: " + getAgency() + " Number: " + getNumber());
        System.out.println("--------------------");
        System.out.println("Balance: " + getBalance());
    };
}
