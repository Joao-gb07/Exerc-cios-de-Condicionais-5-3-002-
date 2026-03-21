import java.util.Scanner;

public class VerificarDigitosNumericos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float num = scan.nextFloat();

        if (num >= 10 && num < 100 || num < -9 && num > -100) {
            System.out.println("O valor digitado tem DOIS dígitos");
        } else {
            System.out.println("O valor digitado NÃO tem dois dígitos");
        }

    }
}
