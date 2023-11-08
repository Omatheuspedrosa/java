package aula_02;

import java.util.Scanner;

public class Calculadora {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		double numero1, numero2;
		
		System.out.println("Digite o número 1: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o número 2: ");
		numero2 = leia.nextDouble();
		
		System.out.printf("\nSoma: %.2f", (numero1 + numero2));
		System.out.printf("\nSubtração: %.2f", (numero1 - numero2));
		System.out.printf("\nMultiplicação: %.2f", (numero1 * numero2));
		System.out.printf("\nDivisão: %.2f", (numero1 / numero2));
		
		System.out.printf("\nRaiz quadrada do número 1: %.2f", (Math.sqrt(numero1)));
		
		System.out.printf("\nPotência do número 1 elevado ao número2: %.2f", (Math.pow(numero1, numero2)));
		
		
	}

}
