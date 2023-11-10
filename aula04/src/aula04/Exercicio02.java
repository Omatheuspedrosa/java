package aula04;

import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero, pares = 0, impares = 0;
		
		for(int contador = 1; contador <= 10; contador ++) {
			System.out.print("Digite o " + contador + "° número: " );
			numero = leia.nextInt();
			if(numero % 2 == 0) {
				pares ++;
			}else {
				impares ++;
			}
		}
		
		System.out.print("Total de números pares: " + pares);
		System.out.print("\nTotal de números ímpares: " + impares);

	}

}
