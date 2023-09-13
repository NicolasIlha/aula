import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        int numeroSoldados = 300000; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tente adivinhar quantos soldados os espartanos irão enfrentar.");

        while (true) {
            System.out.print("Qual seu palpite ?: ");
            int palpite = scanner.nextInt();

            if (palpite < numeroSoldados) {
                System.out.println("Um Pouco Mais!!!");
            } else if (palpite > numeroSoldados) {
                System.out.println("Um Pouco Menos!!!");
            } else {
                System.out.println("Você acertou o número de soldados inimigos.");
                break;
            }
        }

        scanner.close();
    }
}
