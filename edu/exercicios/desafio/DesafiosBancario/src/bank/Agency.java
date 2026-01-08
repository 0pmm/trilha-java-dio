package bank;

import java.util.Scanner;

import bank.clients.*;
import bank.gear.GenericAccount;

public class Agency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericAccount cc = new CurrentBalance();
        GenericAccount sc = new SavingsBalance();

        int gear = 100;
        int option = 1;
        double value;
        
        do {
            System.out.println("Bank Agency System");
            System.out.println("Account: [1] Savings [2] Current [0] Exit");
            gear = scanner.nextInt();
            if(gear == 1) {
                do{
                    System.out.println("------------------------------------");
                    System.out.println("Operations: [1] Transfer [2] Deposit [3] Withdraw [4] Extract [0] Exit");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("Value of transfer: ");
                            value = scanner.nextDouble();
                            sc.transfer(value, cc);
                            break;
                        case 2:
                            System.out.println("Value of deposit: ");
                            value = scanner.nextDouble();
                            sc.deposit(value);
                            break;
                        case 3:
                            System.out.println("Value of withdrawn: ");
                            value = scanner.nextDouble();
                            sc.withdrawn(value);
                            break;
                        case 4:
                            sc.printExtract();
                            break;
                        default:
                            System.out.println("Insert valid number");
                            break;
                    }
                    
                }while(option != 0);  
            } else if(gear == 2) {
                do{
                    System.out.println("------------------------------------");
                    System.out.println("Operations: [1] Transfer [2] Deposit [3] Withdraw [4] Extract [0] Exit");
                    option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            System.out.print("Value of transfer: ");
                            value = scanner.nextDouble();
                            cc.transfer(value, sc);
                            break;
                        case 2:
                            System.out.println("Value of deposit: ");
                            value = scanner.nextDouble();
                            cc.deposit(value);
                            break;
                        case 3:
                            System.out.println("Value of withdrawn: ");
                            value = scanner.nextDouble();
                            cc.withdrawn(value);
                            break;
                        case 4:
                            cc.printExtract();
                            break;
                        default:
                            System.out.println("Insert valid number");
                            break;
                    }
                    
                }while(option != 0);  
            }
        } while(gear != 0);
        scanner.close();
    }
}
