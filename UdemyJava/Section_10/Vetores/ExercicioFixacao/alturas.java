package Section_10.Vetores.ExercicioFixacao;

import java.util.Scanner;
import java.util.Locale;

public class alturas {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nMenores = 0;
        double alturaTotal = 0, alturaMedia, percentualMenores;

        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++){
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }
        for (int i=0; i<alturas.length; i++){
            alturaTotal += alturas[i];
        }

        alturaMedia = alturaTotal / n;

        System.out.printf("\nAltura média: %.2f\n", alturaMedia);

        for (int i=0; i<n; i++){
            if (idades[i] < 16){
                nMenores++;
            }
        }
        percentualMenores = nMenores * 100.0 / n;

        System.out.printf("Pessoas com menos de 16 anos: %.2f\n" , percentualMenores);
        for (int i=0; i<n; i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }
        sc.close();
    }
}
