package aula04;

import java.util.Scanner;

public class Exercicio06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero seja digitado. 
		 * Ao final, mostre na tela a média de todos os números digitados, que sejam múltiplos de 3.*/
		
		int numero = 0, contador = 0;
		float soma = 0.00f, media = 0.00f;
		
		do {
			
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				contador ++;
			}
			
		}while(numero != 0); {
			
		media = soma / contador;
		
		System.out.print("A média de todos os números múltiplos de 3 é: " + media);
		}
	}

}
