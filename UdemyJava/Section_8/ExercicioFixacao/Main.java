package Section_8.ExercicioFixacao;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.println("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(dollarPrice, amount));

        sc.close();
    }
}
