package Section_8.Exercicios.Ex2;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Name: ");
        f.name = sc.nextLine();

        System.out.println("Gross salary: ");
        f.grossSalary = sc.nextDouble();

        System.out.println("Tax: ");
        f.tax = sc.nextDouble();

        System.out.println(f);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        f.increaseSalary(percentage);

        System.out.println("Updated data: " + f);
        sc.close();
    }
}
