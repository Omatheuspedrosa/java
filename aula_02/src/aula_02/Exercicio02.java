package aula_02;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Digite a 1° nota: ");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite a 2° nota: ");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite a 3° nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite a 4° nota: ");
		nota4 = leia.nextFloat();
		
		System.out.printf("Média final: %.1f", (((nota1 + nota2 + nota3 + nota4)/4)));
		

	}

}
