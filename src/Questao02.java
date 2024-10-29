/* 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre.

IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
*/

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String texto = scanner.nextLine();
        scanner.close();

        int quantidade = contarLetraA(texto);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vezes na frase.");
        } else {
            System.out.println("A letra 'a' não aparece na frase.");
        }
    }

    public static int contarLetraA(String texto) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        return contador;
    }
}
