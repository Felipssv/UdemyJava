package Section_10.Vetores.ExercicioFixacao;
import java.util.Scanner;
import java.util.Locale;

public class soma_vetor {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double soma, media;

        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();
        double [] vetor = new double[n];

        for (int i=0; i<n; i++){
            
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }
        
        soma = 0;
        for (int i=0; i<n; i++){
            soma += vetor[i];
        }

        media = soma / n;

            System.out.print("VALORES = ");

        for (int i=0; i<n; i++){
            System.out.printf("%.1f ", vetor[i]);
        }

        System.out.println("\nSOMA = " + soma);
        System.out.println("MÉDIA: " + media);

        sc.close();
    }     
}
