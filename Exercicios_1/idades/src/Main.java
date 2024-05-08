import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int idades;
        int soma = 0;

        System.out.println("Insira as idades das pessoas");
        do {
            idades = sc.nextInt();
            if (idades > 0) {
                soma += idades;
                i++;
            }

            else {
                System.out.println("Esse valor nao e valido insira novamente");
            }

        } while (i < 5);
        sc.close();

        System.out.println("A soma das idades e igual a: " + soma);
    }
}