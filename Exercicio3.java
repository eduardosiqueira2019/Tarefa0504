import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner digitado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: " );

        Integer numero = digitado.nextInt();

        System.out.println(par(numero));

    }

    private static boolean par(Integer umNumero) {
        return umNumero%2 == 0;
    }
}
