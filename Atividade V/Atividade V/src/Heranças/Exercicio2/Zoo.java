package Heranças.Exercicio2;

public class Zoo {
    
    public static void main(String[] args) {
        
    

    Peixe tucunare = new Peixe("Tucunare", 13.7, "Rios");
    Peixe tilapia = new Peixe("Tilapia", 3.5, "Lagos");

    
    Cachorro doguinho = new Cachorro("Bidu", 10.3, "Pastor Alemao");
    Cachorro dogao = new Cachorro("Ulquiorra", 8.7, "Cane corso");

    tucunare.imprimir();
    tilapia.imprimir();
    doguinho.imprimir();
    dogao.imprimir();

}
}
