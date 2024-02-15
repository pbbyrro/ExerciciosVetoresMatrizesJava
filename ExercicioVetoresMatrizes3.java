package ExercicioVetoresMatrizes;

import java.util.Scanner;
public class ExercicioVetoresMatrizes3 {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

    int[][] matrizInteiros = new int[3][3];

    for (int linha = 0; linha < 3; linha++) {
        for ( int coluna = 0; coluna < 3; coluna++) {
            System.out.println(
                    "Digite um valor para a posição [" + linha + "][" + coluna + "]: ");
            matrizInteiros[linha][coluna] = ler.nextInt();
            }
        }
        System.out.println("Elementos da Diagonal Principal: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizInteiros[i][i] + " ");
            somaDiagonalPrincipal += matrizInteiros[i][i];
        }
        System.out.println();

        System.out.println("Elementos da Diagonal Secundária: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(matrizInteiros[i][2 - i] + " ");
            somaDiagonalSecundaria += matrizInteiros[i][2 - i];
        }
        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}