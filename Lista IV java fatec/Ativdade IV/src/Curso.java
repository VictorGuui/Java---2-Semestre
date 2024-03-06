import java.util.ArrayList;
import java.util.List;

public class Curso {
    
    private int numero;
    private String nome;
    private List<Disciplina> lista;

    public Curso(int numero, String nome){

        this.numero = numero;
        this.nome = nome;
        lista = new ArrayList<Disciplina>();
            
        }

        public int getNumero(){
            return numero;
        }
        public void setNumero(int numero){
            this.numero = numero;
        }
        public String getNome(){
            return nome;
        }
        
    public void addDisciplina(Disciplina disciplina){
        lista.add(disciplina);
    }

    public void imprimir(){
        System.out.println("Curso: "+ nome);
        System.out.println("Numero: "+ numero);
    

    System.out.println("Disciplinas");
    for(int i = 0 ;i < lista.size();i++){
        Disciplina disciplina = lista.get(i);
        System.out.println(" ");
        disciplina.imprime();
    }
  }
  public int calcularTotalHora(){
    int total = 0;
    for(int i= 0; i < lista.size();i++){
        Disciplina disciplina = lista.get(i);
        total = total + disciplina.calcularHora();
    }
    System.out.println("A carga horaria total e: "+total);
    return total;
  }

  public int exibeMaiorCargaHoraria(){
    int max = 0;
    for(Disciplina disciplina : lista){
        if(disciplina.calcularHora()> max){
            max = disciplina.calcularHora();
        }
    }
    System.out.println("A maior carga horaria e de : "+ max);
    return max;
  }
}


