package Heranças.Exercicio3;

public class Gerente extends Funcionario {
    private int senha;
    
    public Gerente(String nome, int cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("cpf: "+cpf);
        System.out.println("Salario: "+salario);
        System.out.println("senha: "+senha);
    }
}


