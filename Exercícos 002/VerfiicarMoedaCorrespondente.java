import java.util.Scanner;

public class VerfiicarMoedaCorrespondente {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // (1 para Real, 2 para Dólar, 3 para Euro)
        System.out.println("Digite um número de 1 a 3 para selecionar sua moeda: ");
        int moedas = scan.nextInt();

        if (moedas == 1) {
            System.out.println("Real");
        } else if (moedas == 2) {
            System.out.println("Dolar");
        }

        else if (moedas == 3) {
            System.out.println("Euro");
        } else {
            System.out.println("Número inválido");
        }
    }
}
