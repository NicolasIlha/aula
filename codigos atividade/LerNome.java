import java.util.Scanner;

public class LerNome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Escreva seu nome: ");
        String nome = scan.nextLine();
        System.out.println();
        System.out.println("Seu nome é "+nome);
    }
}