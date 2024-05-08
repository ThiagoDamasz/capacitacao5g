import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o ano a ser verificado: ");
        int ano = sc.nextInt();

        if (ano % 4 == 0) {
            System.out.println("Esse ano é bissexto");
        } else {
            System.out.println("Esse ano não é um ano bissexto");
        }

        sc.close();
    }
}