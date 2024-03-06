public class Main {
 
	public static void main(String[] args) {
		Ponto p1;
		Ponto p2;

		p1 = new Ponto(4, 5);
		p2 = new Ponto(1, 1);

		float resultado = p1.CalculoDistancia(p1,p2);

		System.out.println("Resultado "+resultado);
		//Resulta em 5.0
	}
}

    

