import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        String texto = "string ";
        int tamanho = texto.length();
        int metade = tamanho / 2;
        
        String primeiraMetade = texto.substring(0, metade);
        
        System.out.println("Primeira metade: " + primeiraMetade);
    }
}
