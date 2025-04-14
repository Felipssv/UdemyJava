package Section_10.Matrizes.ExProposto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Insira a quantidade de colunas e linhas da matriz: ");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int [][] matriz = new int[M][N];

        for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Insira o numero que quer saber as informações");
        int x = sc.nextInt();

        for (int i=0; i<matriz.length; i++){
            for (int j=0; j<matriz[i].length; j++){
                if (matriz[i][j] == x){
                    System.out.println("Position " + i + ", " + j + ":");
                    if (j > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (j < matriz[i].length-1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
                }
            }
        }

        

        sc.close();
    }
}
