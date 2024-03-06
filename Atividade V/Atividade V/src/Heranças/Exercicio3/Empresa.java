package Heranças.Exercicio3;

public class Empresa {
    public static void main(String[] args) {
        Gerente gen1;
        Gerente gen2;

        gen1 = new Gerente("Geraldo", 12345676, 1500.00, 123);
        gen2 = new Gerente("Alberto", 9865433, 2000.87, 90028922);

        gen1.imprimir();
        gen2.imprimir();
    }
}
