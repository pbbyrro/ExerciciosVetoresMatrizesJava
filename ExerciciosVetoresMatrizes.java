package ExercicioVetoresMatrizes;
/* Dado um vetor contendo 10 números inteiros não ordenados e não repetidos,
 construa um algoritmo que consiga pesquisar dados no vetor,
 onde o usuário irá digitar um número e o programa deve exibir na tela
 a posição deste número no vetor. Caso o número não seja encontrado,
 a mensagem: “Não foi encontrado!” deve ser exibida na tela.
 */

import java.util.Scanner;
public class ExerciciosVetoresMatrizes {

     public static void main(String[] args) {

         Scanner ler = new Scanner(System.in);

         int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
         int numeroDesejado;
         boolean encontrado = false;

         System.out.println("Digite o número que você deseja encontrar: ");
         numeroDesejado = ler.nextInt();

         for(int i = 0; i < vetor.length; i++) {
             if(vetor[i] == numeroDesejado) {

               System.out.println("O número " + numeroDesejado + " está na posição: " + i);
               encontrado = true;
               break;
             }
         }
        if(!encontrado) {
            System.out.println("O número " + numeroDesejado + " não foi encontrado!");
        }
     }
}
