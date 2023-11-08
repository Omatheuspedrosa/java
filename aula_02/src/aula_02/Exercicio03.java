package aula_02;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float salarioBruto, adicional, horasExtras, descontos;
		
		System.out.println("Informe o salário bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Informe o adicional: ");
		adicional = leia.nextFloat();
		
		System.out.println("Informe a quantidade de horas extras trabalhada: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Informe o total de descontos: ");
		descontos = leia.nextFloat();
		
		System.out.printf("Sálario liquído: R$%.2f", (salarioBruto + adicional + (horasExtras * 5) - descontos));
		

	}

}
