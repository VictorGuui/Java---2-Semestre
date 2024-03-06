package Heranças.Exercico1;

public class Funcionario extends Pessoa{
    double salario;

    public Funcionario(double salario, String RG, String nome){
        super(RG,nome);
        this.salario = salario;      
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double aumentar_Salario(){
        salario = salario+(salario*0.1);
        System.out.println("Salario Com 10% de aumento: "+ salario);
        return salario;
    }

    public void imprimir(){
        System.out.println("RG: "+RG);
        System.out.println("Nome: "+nome);
        System.out.println("Salario atual: "+salario);
    }
}
