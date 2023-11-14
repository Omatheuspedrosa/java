package aula05;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int vetor[] = new int[10];
		int pares[] = new int[10];
		
		for(int indice = 0; indice < 10; indice++ ) {
			System.out.print("Digite o " + (indice + 1) + "° indice: " );
			vetor[indice] = leia.nextInt();
		}
		
		System.out.println("Vetor:");
		
		for(int indice = 0; indice < 10; indice++) {
			System.out.print(vetor[indice] + ", ");
			if(vetor[indice] % 2 == 0) {
				pares[indice] = vetor[indice];
			}
		}
		
		
		

	}

}
