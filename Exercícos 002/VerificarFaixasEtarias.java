import java.util.Scanner;

public class VerificarFaixasEtarias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 18 && idade <= 130) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Valor digitado é inválido.");
        }
    }
}
