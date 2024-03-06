package target.desafios;
//5) Escreva um programa que inverta os caracteres de um string.
//        IMPORTANTE:
//
//        a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
//
//        b) Evite usar funções prontas, como, por exemplo, reverse;

public class Exercicios_5 {
    public static void main(String[] args) {
        // String a ser invertida
        String palavra = "Target Sistemas Arlei Pfutze Jr Estagiario 2024";

        String invertida = inverterString(palavra);

        System.out.println("String original: " + palavra);
        System.out.println("String invertida: " + invertida);
    }
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}

