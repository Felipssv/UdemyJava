package Section_8.Exercicios.Ex3;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Aluno aluno = new Aluno();
        
        System.out.print("Nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Nota 1: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        aluno.nota3 = sc.nextDouble();
        
        System.out.println(aluno);
        
        sc.close();
        
    }
}
