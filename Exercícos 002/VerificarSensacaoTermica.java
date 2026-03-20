import java.util.Scanner;

public class VerificarSensacaoTermica {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura atual: ");
        float temperatura = scan.nextFloat();

        if (temperatura < 15) {
            System.out.println("Está frio hoje.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está ameno hoje.");
        } else {
            System.out.println("Está quente hoje.");

        }

    }
}
