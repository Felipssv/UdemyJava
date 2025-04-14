package Section_9.Meu;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        if (response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            Account account = new Account(number, holder, initialDeposit);
            System.out.println("Account data:\nHolder: " 
            + account.getHolder() + ", Account: " + account.getNumber() + ", Balance: $" + account.getBalance());

            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Updated account data:\nHolder: " 
            + account.getHolder() + ", Account: " + account.getNumber() + ", Balance: $" + account.getBalance());

            System.out.println("Enter a withdraw value: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Updated account data:\nHolder: " 
            + account.getHolder() + ", Account: " + account.getNumber() + ", Balance: $" + account.getBalance());

        } else if(response == 'n'){ 
            Account account = new Account(number, holder);
            System.out.println("Account data: " + account.getHolder() + ", " + account.getNumber() + ", " + account.getBalance());

            System.out.println("Enter a deposit value: ");
            double depositValue = sc.nextDouble();
            account.deposit(depositValue);
            System.out.println("Updated account data:\nHolder: " 
            + account.getHolder() + ", Account: " + account.getNumber() + ", Balance: $" + account.getBalance());

            System.out.println("Enter a withdraw value: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);
            System.out.println("Updated account data:\nHolder: " 
            + account.getHolder() + ", Account: " + account.getNumber() + ", Balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid response");
        }

        sc.close();
    }
}
