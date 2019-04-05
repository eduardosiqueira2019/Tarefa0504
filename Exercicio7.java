public class Exercicio7 {

    public static void main(String[] args) {

        int max=10;
        int min=1;



        System.out.println(listaDeNumerosEntre(min,max););
    }

    private static void listaDeNumerosEntre(Integer mínimo, Integer máximo){

        int contador = 0;
        int tamanho = (máximo - mínimo);
        Integer[] array;
        array = new Integer[tamanho];

        for(Integer i = mínimo;i<=máximo;i++){
            array[contador] = i;
            contador++;
        }
    }

}
