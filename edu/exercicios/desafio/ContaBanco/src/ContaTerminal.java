import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        int number;
        double balance;
        String name, agency;


        System.out.println("---------TERMINAL_BANCARIO---------");
        System.out.print("Por Favor, insira o numero de sua Conta: ");
            number = scanner.nextInt();
            user.setNumber(number);
        System.out.print("Por Favor, insira o numero de sua Agencia: ");
            agency = scanner.next();
            user.setAgency(agency);
            scanner.nextLine();
        System.out.print("Por Favor, insira o Nome Completo: ");
            name = scanner.nextLine();
            user.setClientName(name);
        System.out.print("Por Favor, insira o Saldo atual: ");
            balance = scanner.nextDouble();
            user.setBalance(balance);
        System.out.println();

        System.out.println("Olá " + user.getClientName() + ", obrigado por criar uma conta em nosso banco, sua agência é " + user.getAgency() +", conta " + user.getNumber() + " e seu saldo de " + user.getBalance() + " já está disponível para saque");

        scanner.close();
    }
}
