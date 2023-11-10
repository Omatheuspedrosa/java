package aula04;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		 * Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.*/
		
		int numero, soma = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			if (numero > 0) {
				soma += numero;
			}			
		}while(numero != 0); 
					
		System.out.print("Soma dos números positivos digitados: " + soma);

	}

}
