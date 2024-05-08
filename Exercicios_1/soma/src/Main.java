
public class Main {
    public static void main(String[] args) {


        int soma = 0;

        for (int i = 1; i <= 15; i++) {
            soma = i + soma;
        }

        System.out.println("A soma dos numeros e igual a: " + soma);
    }
}