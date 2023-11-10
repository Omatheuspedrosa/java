package aula04;

import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		int numero1, numero2;
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextInt();
		
		if (numero1 >= numero2) {
			System.out.println("Intervalo Inválido!");			
			}
		else {
				for(int contador = numero1; contador <= numero2; contador ++) {
					if(contador % 3 == 0 && contador % 5 == 0) {
						System.out.println(contador + " é múltiplo de 3 e 5");
					}
					}
				}
			}
		}

	
	
