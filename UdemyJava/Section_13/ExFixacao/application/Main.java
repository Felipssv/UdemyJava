package Section_13.ExFixacao.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Section_13.ExFixacao.entities.Pessoa;
import Section_13.ExFixacao.entities.PessoaFisica;
import Section_13.ExFixacao.entities.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.printf("Tax payer #%s data: \n", i);
            System.out.print("Individual or company (i/c)? ");
            char x = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (x == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, healthExpenditures));
            }
            else{
                System.out.print("Number of employees: ");
                int nEmp = sc.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, nEmp));
            }
        }
        double soma = 0.0;
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Pessoa p : list){
            double taxa = p.taxa();
            System.out.println(p.getNome() + ": $ " + String.format("%.2f", taxa));
            soma += taxa;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));

        sc.close();
    }
}
