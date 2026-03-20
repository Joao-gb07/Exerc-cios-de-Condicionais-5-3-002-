import java.util.Scanner;

public class DeterminarDiasDaSemana {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 7 ");
        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda-Feira");
        } else if (diaSemana == 3) {
            System.out.println("Terça-Feira");
        } else if (diaSemana == 4) {
            System.out.println("Quarta-Feira");
        } else if (diaSemana == 5) {
            System.out.println("Quinta-Feira");
        } else if (diaSemana == 6) {
            System.out.println("Sexta-Feira");
        } else if (diaSemana == 7) {
            System.out.println("Sábado");
        }

        else {
            System.out.println("Número digitado é inválido");
        }

    }
}