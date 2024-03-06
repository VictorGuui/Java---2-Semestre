public class Disciplina {
    private String nome;
    private int codigo;
    private int cargaHoraria;

    public Disciplina(String nome, int codigo, int cargaHoraria){
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public void imprime(){
        System.out.println("Disciplina:: "+nome);
        System.out.println("Codigo: "+codigo);
        System.out.println("Carga horaria: "+cargaHoraria);
    }

    public int calcularHora(){
        return cargaHoraria;
    }
}
