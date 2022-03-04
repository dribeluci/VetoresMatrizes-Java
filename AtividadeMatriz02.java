/*Exercício proposto: 
Crie um programa que receba valores do usuário para preencher
uma matriz 3X3, e em seguida, exiba a soma dos valores dela e a 
soma dos valores da primeira diagonal, ou seja, diagonal principal. */

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class AtividadeMatriz02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		int soma = 0, diagonal = 0;

		for (int i = 0; i <= 2; i++) {
			for (int a = 0; a <= 2; a++) {
				System.out.printf("Digite um valor %d %d: ", i, a);
				matriz[i][a] = entrada.nextInt();
				soma = soma + (matriz[i][a]);
				if (i == a) {
					diagonal = diagonal + (matriz[i][a]);

				}
			}
		}
		System.out.println("\nA soma da diagonal é: " + diagonal);
		System.out.println("\nA soma dos valores é: " + soma);
		entrada.close();
	}
}
