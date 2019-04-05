import java.util.List;

public class Exercicio6 {

    public static void main(String[] args) {

        System.out.println(listaDePrimeirosCemPositivos());
    }



    private static Integer[] listaDePrimeirosCemPositivos() {

        int contador=0;
        Integer numero = 0;
        Integer array[] = new Integer[ 100 ];


        while (contador < 100) {
                array[contador] = numero;
                numero+=2;
                contador++;
        }
        return array;
    }
}
