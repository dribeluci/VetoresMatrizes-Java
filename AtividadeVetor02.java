/*  Exerc�cio Proposto
 
Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
 Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize 
e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
*/

package exerciciosVetoresMatrizes;

import java.util.Scanner;

public class AtividadeVetor02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[] arrayVetor = { 4, 6, 2, 5, 6, 3, 5, 1, 4, 2 };

		int media = 0, soma = 0, p = 0;

		for (int i = 0; i <= 9; i++) {
			System.out.println("\nOs lan�amentos do dado foram: " + arrayVetor[i]);
			soma = soma + arrayVetor[i];
			media = soma / 10;
			if (arrayVetor[i] == 6) {
				p++;
			}
		}
		System.out.println("\nA m�dia �:  " + media);
		System.out.println("\nA quantidade do n�mero de maior pontua��o foi:  " + p);
		leia.close();
	}
}