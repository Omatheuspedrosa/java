package aula05;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		String pessoas[] = {"Luiz", "Aline", "Vinicius", "Antônio", "Vitor", "Samara"};
		
		float[] notas = new float[5];
		
		/*for(int indice = 0; indice < 5; indice ++) {
			System.out.print("Digite o valor na posição " + indice + ": ");
			notas[indice] = leia.nextFloat();
		}
		
		for(int indice = 0; indice < notas.length; indice ++) {
			System.out.println("Posição " + indice + " = " + notas[indice]);
		}*/				
		
		Arrays.sort(pessoas);
		
		for(int indice = 0; indice < pessoas.length; indice ++) {
			System.out.println("Posição " + indice + " = " + pessoas[indice]);
		}
		
		System.out.println("Posição do elemento 'Aline': " + Arrays.binarySearch(pessoas, "Aline"));
		

	}

}
