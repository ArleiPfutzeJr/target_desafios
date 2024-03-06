//1) Observe o trecho de código abaixo:
//        int INDICE = 13, SOMA = 0, K = 0;
//        enquanto K < INDICE faça
//        {
//        K = K + 1;
//        SOMA = SOMA + K;
//        }
//        imprimir(SOMA);
//        Ao final do processamento, qual será o valor da variável SOMA?
package target.desafios;
public class Exercicios_1 {
    public static void main(String[] args) {int INDICE=13;
     int SOMA=0;
     int k=0;

     while ( k < INDICE){
        k++;
        SOMA+=k;
     }
        System.out.println("O valor da variável soma é " + SOMA);

    }

}
