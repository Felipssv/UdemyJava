package Section_13.ExFixacao.entities;

public class PessoaJuridica extends Pessoa{

    private Integer numFuncionarios;

    public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public Integer getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(Integer numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    public Double taxa(){
        if (numFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }
        else{
            return getRendaAnual() * 0.16;
        }
    }
}
