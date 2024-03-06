//3) Descubra a lógica e complete o próximo elemento:
//        a) 1, 3, 5, 7, ___
//
//        b) 2, 4, 8, 16, 32, 64, ____
//
//        c) 0, 1, 4, 9, 16, 25, 36, ____
//
//        d) 4, 16, 36, 64, ____
//
//        e) 1, 1, 2, 3, 5, 8, ____
//
//        f) 2,10, 12, 16, 17, 18, 19, ____

package target.desafios;
public class Exercicios_3 {
    public static void main(String[] args) {
        // Sequência a)
        System.out.println("Sequência a):");
        for (int i = 1; i <= 9; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Sequência b)
        System.out.println("Sequência b):");
        int numero = 2;
        for (int i = 1; i <= 6; i++) {
            System.out.print(numero + " ");
            numero *= 2;
        }
        System.out.println(numero);

        // Sequência c)
        System.out.println("Sequência c):");
        for (int i = 0; i <= 6; i++) {
            System.out.print(i * i + " ");
        }
        System.out.println(7 * 7);

        // Sequência d)
        System.out.println("Sequência d):");
        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i * i + " ");
        }
        System.out.println();

        // Sequência e)
        System.out.println("Sequência e):");
        int anterior = 1;
        int atual = 1;
        System.out.print(anterior + " " + atual + " ");
        for (int i = 3; i <= 7; i++) {
            int proximo = anterior + atual;
            System.out.print(proximo + " ");
            anterior = atual;
            atual = proximo;
        }
        System.out.println();

        // Sequência f)
        System.out.println("Sequência f):");
        numero = 2;
        for (int i = 1; i <= 6; i++) {
            System.out.print(numero + " ");
            numero += (i % 3 == 0) ? 1 : (i % 3 == 1) ? 8 : 2;
        }
        System.out.println(numero);
    }
}
