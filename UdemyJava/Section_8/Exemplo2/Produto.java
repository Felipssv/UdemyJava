package Section_8.Exemplo2;

public class Produto {

    //atributos da classe
    private String nome;
    private double preco;
    private int quantidade;

    //construtores da classe
    public Produto(){
    }

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco ){
        this.nome = nome;
        this.preco = preco;
    }

    //gets e sets
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }


    //metodos da classe
    public double valorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    public String toString(){
        return nome
        + ", $ " 
        + String.format("%.2f", preco) 
        +  ", " 
        + quantidade 
        + " unidades, Total: $ " 
        + String.format("%.2f", valorTotalEmEstoque());
    }
}
