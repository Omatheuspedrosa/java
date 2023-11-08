package aula_02;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float valor1, valor2, valor3, valor4;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = leia.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = leia.nextFloat();
		
		System.out.println("Digite o quarto valor: ");
		valor4 = leia.nextFloat();
		
		System.out.println("Diferença do produto dos valores 1 e 2 pelo produto dos valores 3 e 4: " + ((valor1 * valor2) - (valor3 * valor4)));
		

	}

}
