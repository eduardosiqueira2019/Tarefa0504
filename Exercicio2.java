public class Exercicio2 {

    public static void main(String[] args) {

        String texto1 = "WERT";
        String texto2 = "WERTe";

        System.out.println(cadeiasDeTextoDiferentes(texto1,texto2));
    }

    private static Boolean cadeiasDeTextoDiferentes(String umTextoA, String umTextoB){

        return umTextoA != umTextoB;
    }
}
