package aula05;

import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int somaP = 0,  somaS = 0;
		String diagonalP = "", diagonalS = "";
		
		for(int linha = 0; linha < matriz.length; linha ++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				System.out.println("Digite o número da posição: (" + linha + "," + coluna + "): ");
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		//Principal
		for(int indice = 0; indice < matriz.length; indice ++) {
			diagonalP += matriz[indice][indice] + " ";
			somaP += matriz[indice][indice];
		}
		
		//Secundaria
		for(int indice = 0; indice < matriz.length; indice ++) {
			diagonalS += matriz[indice][matriz.length - 1 - indice] + " ";
			somaS += matriz[indice][indice];
		}
		
		System.out.println("Elementos da Diagonal Principal: " + diagonalP);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);
		
		System.out.println("Elementos da Diagonal Secundária: " + diagonalS);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);
			

	}

}
