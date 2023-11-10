package aula04;

import java.util.Scanner;

public class Exercicio04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int idade, genero, area, devBeck = 0, mulherFront = 0, homemMob40Mais = 0, naoBFull30menos = 0;
		float media, total = 0, somaIdade = 0;
		char resposta = 'S';
		
		while(resposta == 'S') {
			System.out.print("\nIdade: ");
			idade = leia.nextInt();
			somaIdade += idade;
			
			System.out.println("-------Identidade de Gênero-------");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.println("----------------------------------");
			
			System.out.print("\nIdentidade de Gênero: ");
			genero = leia.nextInt();
			
			System.out.println("-------Pessoa Desenvolvedora-------");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - Fullstack");
			System.out.println("----------------------------------");
			
			System.out.print("\nPessoa Desenvolvedora: ");
			area = leia.nextInt();
			total ++;
			
			if(area == 1) {
				devBeck ++;
			}
			if((genero == 1 || genero == 4) && area == 2) {
				mulherFront ++;
			}
			if((genero == 2 || genero == 5) && area == 3 && idade > 40) {
				homemMob40Mais ++;
			}
			if(genero == 3 && area == 4 && idade < 30) {
				naoBFull30menos ++;
			}
			
			System.out.println("\nDeseja continuar (S/N): ");
			resposta = leia.next().toUpperCase().charAt(0);
			if (resposta == 'N') {
				System.out.println("\nTotal de pessoas desenvolvedoras Backend: "+ devBeck);
				System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherFront);
				System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemMob40Mais);
				System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBFull30menos);
				System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
				media = somaIdade / total;
				System.out.printf("A média de idade das pessoas que responderam à pesquisa: %2.f", media);
			}

		}
		

	}

}
