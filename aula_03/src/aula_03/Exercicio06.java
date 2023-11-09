package aula_03;

import java.util.Scanner;

public class Exercicio06 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nome;
		int codigo;
		float salario;
		
		System.out.println("----------Tabela de Reajustes----------");
		System.out.println("1 - Gerente - 10%");
		System.out.println("2 - Vendedor - 7%");
		System.out.println("3 - Supervisor - 9%");
		System.out.println("4 - Motorista - 6%");
		System.out.println("5 - Estoquista - 5%");
		System.out.println("6 - Técnico de TI - 8%");
		System.out.println("---------------------------------------");
		
		System.out.print("Informe o nome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.printf("Informe o código do cargo: ");
		codigo = leia.nextInt();
		
		System.out.printf("Informe o salário do colaborador: ");
		salario = leia.nextFloat();
		
		switch(codigo) {
			case 1:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.1)));
				break;
			case 2:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.07)));
				break;
			case 3:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.09)));
				break;
			case 4:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.06)));
				break;
			case 5:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.05)));
				break;
			case 6:
				System.out.printf("Novo salário do %s: R$%.2f", nome, (salario + (salario * 0.08)));
				break;
		}

	}

}
