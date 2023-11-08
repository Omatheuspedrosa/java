package aula_02;

import java.util.Scanner;

public class Operadores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int numero1 = 10, numero2 = 20;
		String valor1 = "2", valor2 = "5";
		
		int tamanho = 0; 
		
		float media = 3.43535f;
		
		System.out.println("A soma das variáveis do número 1 e número 2 é: " + (numero1 + numero2));
		System.out.println("A soma das variáveis do valor 1 e valor 2 é: " + (valor1 + valor2));
		
		System.out.printf("A média é: %.2f", media);
		
		System.out.println("\nDigite o tamanho: ");
		tamanho = leia.nextInt();
		
		System.out.println("O tamanho digitado foi: " + tamanho);

	}

}
