package aula_03;

import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*Faça um algoritmo em Java que leia 3 valores inteiros A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.*/
		
		int a, b, c;
		
		System.out.printf("Digite o valor A: ");
		a = leia.nextInt();
		
		System.out.printf("Digite o valor B: ");
		b = leia.nextInt();
		
		System.out.printf("Digite o valor C: ");
		c = leia.nextInt();
		
		if(a + b > c) {
			System.out.println("A Soma dos valores A e B é maior que C! ");
		}else if (a + b < c) {
			System.out.println("A Soma dos valores A e B é menor que C! ");
		}else {
			System.out.println("A Soma dos valores A e B é igual que C! ");
		}

	}

}
