package Heranças.Exercico1;

public class Main {

    public static void main(String[] args) {
        Funcionario ana;

        ana = new Funcionario(1000.00, "1234566", "Ana");
       
        ana.imprimir();
        ana.aumentar_Salario();

}
}