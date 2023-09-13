public class questao5 {

    public static void main(String[] args) {
        int hora = 10;
        int minuto = 30;
        int segundo = 45;

        int segundosPassados = hora * 3600 + minuto * 60 + segundo;
        int segundosFaltantes = (24 - hora) * 3600 + (60 - minuto) * 60 + (60 - segundo);

        System.out.println("Segundos passados desde 0h00min0s: " + segundosPassados);
        System.out.println("Segundos faltantes para meia noite: " + segundosFaltantes);
        }
    }