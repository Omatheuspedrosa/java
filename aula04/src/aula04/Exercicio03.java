package aula04;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros), via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos 
		 * e o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser finalizada ao digitar uma idade negativa.*/
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		
		
		while(idade >= 0) {
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade >= 0 && idade < 21) {
				menor21 ++;
			}
			if (idade > 50) {
				maior50 ++;
			}
		
		}
		System.out.print("Total de pessoas menores de 21 anos: " + menor21);
		System.out.print("\nTotal de pessoas maiores de 50 anos: " + maior50);

	}

}
