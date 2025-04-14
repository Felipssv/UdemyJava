package Section_10.Vetores.ExercicioFixacao;
import java.util.Scanner;

public class numeros_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int vetor[] = new int[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: \n"); 
            vetor[i] = sc.nextInt();
            }
            
        System.out.println("\nNUMEROS PARES:");

            int pares = 0;
        for (int i=0; i<n; i++){
            if (vetor[i] % 2 == 0){
                System.out.printf("%d ", vetor[i]);
                pares ++;
            }
        }
        System.out.printf("\n\n QUANTIDADES DE PARES: %d\n", pares);
        sc.close();
        }
    }

