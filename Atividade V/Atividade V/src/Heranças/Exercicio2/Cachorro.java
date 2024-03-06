package Heranças.Exercicio2;

public class Cachorro extends Animal {
    
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }
   
    public String getRaca(){
        return raca;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("raca: "+raca);
        System.out.println("Peso: "+peso);
    }
}
