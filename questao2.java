import java.util.Scanner;

public class questao2 {

    public static void main(String[]args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Escreva primeiro número: ") ;
        float primeironumero = scan.nextFloat();

        System.out.print("Escreva segundo número" ) ;
        float segundonumero = scan.nextFloat();

        System.out.println(" Os números são" + primeironumero + "," + segundonumero );

    }
}