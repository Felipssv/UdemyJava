package Section_8.Exercicios.Ex2;

public class Funcionario {
    
    public String name;
    public double grossSalary;
    public double tax;


    public double netSalary() {
        return grossSalary - tax;
    }

    public double increaseSalary(double percentage){
        return grossSalary += grossSalary * percentage / 100;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", netSalary());
    }
}
