import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Informe sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Informe seu salário: ");
        double salario = scanner.nextDouble();

        if (idade >= 18 && salario > 2000) {
            System.out.println("Você pode comprar.");
        } else {
            System.out.println("Você não pode comprar");
        }

    }
}