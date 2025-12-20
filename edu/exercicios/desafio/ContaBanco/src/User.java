public class User {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public String getAgency() {
        return agency;
    }
    public double getBalance() {
        return balance;
    }
    public String getClientName() {
        return clientName;
    }
    public int getNumber() {
        return number;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public void setNumber(int number) {
        this.number = number;
    }
}
