import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Integer num1;
        Integer num2;
        Integer num3;
        Integer num4;

        Scanner numeroDigitado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = numeroDigitado.nextInt();
        System.out.println("Digite o segundo número: ");
        num2 = numeroDigitado.nextInt();
        System.out.println("Digite o terceiro número: ");
        num3 = numeroDigitado.nextInt();
        System.out.println("Digite o quarto número: ");
        num4 = numeroDigitado.nextInt();

        System.out.println(algumMaior(num1,num2,num3,num4));
    }

    private static Boolean algumMaior(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC, Integer umNumeroD){

        return (umNumeroA > umNumeroC && umNumeroA > umNumeroD) || (umNumeroB > umNumeroC && umNumeroB > umNumeroD);
    }

}
