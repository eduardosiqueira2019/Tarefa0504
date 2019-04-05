
public class Exercicio1 {

    public static void main(String[] args) {

        Integer numA = 1;
        Integer numB = 5;
        Integer numC = 3;

        System.out.println(maiorDeTresNumeros(numA,numB,numC));

    }

        private static Integer maiorDeTresNumeros(Integer umNumeroA, Integer umNumeroB, Integer umNumeroC) {

        Integer maior = 0;

        if(umNumeroA > maior){
            maior = umNumeroA;
        }

        if(umNumeroB > maior){
            maior = umNumeroB;
        }

        if(umNumeroC > maior){
            maior = umNumeroC;
        }

        return maior;
    }
}
