package Section_8.Exercicios.Ex3;

public class Aluno {
    
    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    

    public double total() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovado() {
        if (total() >= 60) {
            return true;
        }
        return false;

    }

    public String toString() {
        return "Final grade: " + total()
        + "\n" + (aprovado() ? "PASS" : "FAILED\nMISSING " + (60 - total()) + " POINTS");
        };
    }

