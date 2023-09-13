import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("string: ");


        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        System.out.println("String invertida: " + reversed);

        scanner.close();
    }
}
