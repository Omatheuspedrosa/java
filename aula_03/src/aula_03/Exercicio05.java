package aula_03;

import java.util.Scanner;

public class Exercicio05 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int codigo, quantidade;
		
		System.out.println("-----------Cardápio----------- ");
		System.out.println("1 - Cachorro Quente | R$10.00");
		System.out.println("2 - X-Salada | R$15.00");
		System.out.println("3 - X-Bacon | R$18.00");
		System.out.println("4 - Bauru | R$12.00");
		System.out.println("5 - Refrigerante | R$8.00");
		System.out.println("6 - Suco de Laranja | R$13.00");
		System.out.println("------------------------------ ");
		
		System.out.print("Informe o código do item(1-6): ");
		codigo = leia.nextInt();
		
		System.out.print("\nQuantidade: ");
		quantidade = leia.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.printf("Valor total: R$%.2f", (10.00 * quantidade) );
				break;
			case 2:
				System.out.printf("Valor total: R$%.2f", (15.00 * quantidade) );
				break;
			case 3:
				System.out.printf("Valor total: R$%.2f", (18.00 * quantidade) );
				break;
			case 4:
				System.out.printf("Valor total: R$%.2f", (12.00 * quantidade) );
				break;
			case 5:
				System.out.printf("Valor total: R$%.2f", (8.00 * quantidade) );
				break;
			case 6:
				System.out.printf("Valor total: R$%.2f", (13.00 * quantidade) );
				break;
		}
		
	}

}
