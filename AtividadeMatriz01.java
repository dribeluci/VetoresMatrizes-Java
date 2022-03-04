/* Exercício proposto
 Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 */

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class AtividadeMatriz01 {
	public static void main(String[] args) {

		Scanner entradaVetor = new Scanner(System.in);

		int[][] n1 = { { 1, 2, 3, 4, 5, 6 },
				     { 1, 2, 3, 4, 5, 6 }, 
				     { 1, 2, 3, 4, 5, 6 }, 
				     { 1, 2, 3, 4, 5, 6 }};

		int[][] n2 = { { 1, 2, 3, 4, 5, 6 }, 
				{ 1, 2, 3, 4, 5, 6 }, 
				{ 1, 2, 3, 4, 5, 6 },
				{ 1, 2, 3, 4, 5, 6 } };

		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		System.out.println("MATRIZ SOMA ");
		for (int i = 0; i <= 3; i++) {
			for (int a = 0; a <= 3; a++) {
				m1[i][a] = n1[i][a] + n2[i][a];
				System.out.print(m1[i][a] + "|");
			}
			System.out.println();
		}

		System.out.println();

		System.out.println("MATRIZ SUBTRACAO ");
		for (int i = 0; i <= 3; i++) {
			for (int a = 0; a <= 3; a++) {
				m2[i][a] = n1[i][a] - n2[i][a];
				System.out.print(m2[i][a] + "|");
			}
			System.out.println();
		}
		entradaVetor.close();
	}

}
