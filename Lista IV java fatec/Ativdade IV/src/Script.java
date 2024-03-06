public class Script {
    public static void main(String[] args) {
        Disciplina d1,d2,d3,d4;
        d1 = new Disciplina("Linguagem de programacao", 100, 40);
        d2 = new Disciplina("Comunicacao e expressao", 101, 40);
        d3 = new Disciplina("Eng software", 102, 40);
        d4 = new Disciplina("Linguagem de programacao", 103, 40);

        Curso ads = new Curso(4444, "Analise e desenvolvimento de sistemas");

        ads.addDisciplina(d1);
        ads.addDisciplina(d2);
        ads.addDisciplina(d3);
        ads.addDisciplina(d4);
        ads.imprimir();
        ads.calcularTotalHora();
        ads.exibeMaiorCargaHoraria();
    }
}
