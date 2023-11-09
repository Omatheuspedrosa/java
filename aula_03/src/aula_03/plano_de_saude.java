package aula_03;

import java.util.Scanner;

public class plano_de_saude {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		System.out.print("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.print("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade > 0 && idade <= 10) {
			System.out.printf("%s, o seu plano de saúde custará R$100 reais mensais.", nome);
		}else if (idade >= 11 && idade <=29) {
			System.out.printf("%s, o seu plano de saúde custará R$200 reais mensais.", nome);
		}else if (idade >= 30 && idade <= 45) {
			System.out.printf("%s, o seu plano de saúde custará R$300 reais mensais.", nome);
		}else if (idade >= 46 && idade <=59) {
			System.out.printf("%s, o seu plano de saúde custará R$500 reais mensais.", nome);
		}else if (idade >= 60 && idade <= 65) {
			System.out.printf("%s, o seu plano de saúde custará R$600 reais mensais.", nome);
		}else {
			System.out.printf("%s, o seu plano de saúde custará R$1000 reais mensais.", nome);
		}

	}

}
