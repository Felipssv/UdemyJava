package Section_8.Exemplo1;
import java.util.Scanner;
import java.util.Locale;

public class  Program{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Triangulo x,y;
        x = new Triangulo();
        y = new Triangulo();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the measures of triangle x: ");
        x.A  = sc.nextDouble();
        x.B  = sc.nextDouble();
        x.C  = sc.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.A  = sc.nextDouble();
        y.B  = sc.nextDouble();
        y.C  = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }
        sc.close();
    }
}


