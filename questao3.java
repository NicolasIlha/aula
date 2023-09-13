import java.util.Scanner;

public class questao3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero 1: ");
        float numero1 = Float.parseFloat(entrada.nextLine());

        System.out.print("Numero 2: ");
        float numero2 = Float.parseFloat(entrada.nextLine());

        System.out.print("Numero 3: ");
        float numero3 = Float.parseFloat(entrada.nextLine());

        System.out.println("Maior: " + MaiorDeTres(numero1, numero2, numero3) + "\nMenor: " + MenorDeTres(numero1, numero2, numero3)
                + "\nMedia: " + MediaDeTres(numero1, numero2, numero3));
    }

    public static float MaiorDeTres(float numero1, float numero2, float numero3) {
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                return numero1;
            } else {
                return numero3;
            }
        } else {
            if (numero2 > numero3) {
                return numero2;
            } else {
                return numero3;
            }
        }
    }

    public static float MenorDeTres(float numero1, float numero2, float numero3) {
        if (numero1 < numero2) {
            if (numero1 < numero3) {
                return numero1;
            } else {
                return numero3;
            }
        } else {
            if (numero2 < numero3) {
                return numero2;
            } else {
                return numero3;
            }
        }
    }

    public static float MediaDeTres(float numero1, float numero2, float numero3) {
        return (numero1 + numero2 + numero3 ) / 3;
    }
}