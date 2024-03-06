public class Teste {
    public static void main(String[] args) {
        String frase = "Cada dia e um novo dia e aois cada dia existe um novo dia";
        String fraseNova = frase.replace("dia", "noite");


        System.out.println("Ultima posicao do caracter t: "+frase.lastIndexOf("t"));
        System.out.println("Ultima posicao do caracter a: "+frase.lastIndexOf("t",20));
        System.out.println("Palavra na posicao: "+frase.substring(13,18));
        System.out.println("Ultima posicao do caracter: "+frase.substring(13));

        System.out.println("Original:"+ frase);
        System.out.println("Nova:"+ fraseNova);
    }
}
