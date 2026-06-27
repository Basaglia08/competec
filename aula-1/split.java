import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine().trim();

        String[] partes = nomeCompleto.split("\\s+");

        if (partes.length >= 2) {
            System.out.println("Seu segundo nome é: " + partes[1]);
        } else {
            System.out.println("Você não digitou um segundo nome.");
        }

        sc.close();
    }
}
