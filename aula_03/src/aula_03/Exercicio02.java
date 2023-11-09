package aula_03;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia um número inteiro via teclado e mostre na tela uma mensagem indicando se este número é par ou ímpar 
		 * e se o número é positivo ou negativo. Veja os exemplos abaixo*/
		
		int numero;
		
		System.out.print("Digite um número: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0 && numero > 0 ) {
			System.out.printf("%d é par positivo!", numero);
		}else if(numero % 2 != 0 && numero > 0 ) {
			System.out.printf("%d é ímpar positivo!", numero);
		}else if(numero % 2 == 0 && numero < 0 ) {
			System.out.printf("%d é par negativo!", numero);
		}else {
			System.out.printf("%d é ímpar negativo!", numero);
		}

	}

}
