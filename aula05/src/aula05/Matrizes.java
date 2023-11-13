package aula05;

import java.util.Scanner;

public class Matrizes {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
				
		int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		double[][] matrizDouble = new double[3][3];
		
		/*
		//Controlar a linha
		for(int linha = 0; linha < matriz.length; linha ++) {
			//Controlar a coluna
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Matriz[" + linha + "][" + coluna  + "] = " + matriz[linha][coluna] );
			}
		}*/
		
		for(int linha = 0; linha < matrizDouble.length; linha ++) {
			//Controlar a coluna
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Matriz[" + linha + "][" + coluna  + "] = " + (matrizDouble[linha][coluna] = leia.nextDouble()));
			}		
		}
		
		for(int linha = 0; linha < matrizDouble.length; linha ++) {
			//Controlar a coluna
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				System.out.println("Matriz[" + linha + "][" + coluna  + "] = " + matrizDouble[linha][coluna] );
			}		
		}

	}

}
