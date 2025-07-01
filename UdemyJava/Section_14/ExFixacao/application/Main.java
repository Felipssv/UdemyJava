package ExFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import ExFixacao.model.entities.Account;
import ExFixacao.model.exceptions.BusinessException;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
            System.out.println("Enter account data ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
        try{
            acc.withdraw(amount);
            System.out.printf("New balance: R$%.2f", acc.getBalance());
        }
        catch (BusinessException e){
            System.out.println("Withdraw error! " + e.getMessage());
        }
        sc.close();
    }
}
