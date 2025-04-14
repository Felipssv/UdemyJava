package Section_8.Exemplo2;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    
    public static void main(String[] args) {
        
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as informações do produto: ");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade no estoque: ");
        int quantidade = sc.nextInt();
        Produto produto = new Produto(nome, preco, quantidade);


        System.out.println("Dados do produto: " + produto);

        System.out.println("Digite o número de produtos a ser adicionado ao estoque: ");
        quantidade = sc.nextInt();
        produto.adicionarProdutos(quantidade);

        System.out.println("Dados atualizados: " + produto);

        System.out.println("Digite o número de produtos a ser removido do estoque: ");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println("Dados atualizados: " + produto);

        sc.close();

    }
}
