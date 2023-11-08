package aula_02;

import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float salario, abono;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		System.out.printf("Novo salario: " + "R$%.2f", (salario + abono));
		
		
		
	}

}
