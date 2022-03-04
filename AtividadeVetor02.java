/*  Exercício Proposto
 
Um dado é lançado 10 vezes e o valor correspondente é anotado. 
 Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
e apresente também quantas foram as ocorrências da maior pontuação.
*/

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class AtividadeVetor02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] arrayVetor = { 4, 6, 2, 5, 6, 3, 5, 1, 4, 2 };

		int media = 0, soma = 0, p = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.println("\nOs lançamentos do dado foram: " + arrayVetor[i]);
			soma = soma + arrayVetor[i];
			media = soma / 10;
			if (arrayVetor[i] == 6) {
				p++;
			}
		}
		System.out.println("\nA média é:  " + media);
		System.out.println("\nA quantidade do número de maior pontuação foi:  " + p);
		leia.close();
	}
}