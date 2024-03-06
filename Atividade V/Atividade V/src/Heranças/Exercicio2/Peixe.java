package Heranças.Exercicio2;

public class Peixe extends Animal{
    
    private String tipoHabitat;

    public Peixe(String nome, double peso, String tipoHabitat){
        super(nome, peso);
        this.tipoHabitat = tipoHabitat;
    }

    public String getTipoHabitat(){
        return tipoHabitat;
    }
    public void setTipoHabitat(String tipoHabitat){
        this.tipoHabitat = tipoHabitat;
    }

    

    public void imprimir(){
        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+peso);
        System.out.println("Habitat: "+tipoHabitat);
    }

    }

