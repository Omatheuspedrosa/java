package aula05;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar 
		 * um número e o programa deve exibir na tela a posição deste número no vetor. Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na 
		 * tela.*/
		
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int n;
		boolean encontrado = false;
		
		for(int indice = 0; indice < 10; indice ++) {
			System.out.println("Indice " + indice + ": " + vetor[indice]);
		}
				
		System.out.print("Digite o número que você deseja encontrar: ");
		n = leia.nextInt();
		
		for (int indice = 0; indice < 10; indice ++) {
			if (vetor[indice] == n) {
				System.out.println("O número " + n + " está localizado na posição: " + indice);
				encontrado = true;
				break;
			}
		}
		if (!encontrado) {
			System.out.println("O número " + n + " não foi encontrado!");

		int posicao =  Arrays.binarySearch(vetor, n);
		
		if(posicao < 0) {
			System.out.println("O número " + n + " não foi localizado!");
		}else {
			System.out.println("O número " + n + " está localizado na posição: " + posicao);

		}

		
	}

	}
}
