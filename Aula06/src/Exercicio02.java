import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio02 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
				
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		int numero;
		
		for(int contador = 1; contador <=10; contador++)
			numeros.add(contador);
		
		System.out.println(numeros);
		
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if(numeros.contains(numero))
			System.out.println("O número " + numero + " foi encontrado na posição: " + numeros.indexOf(numero));
		else
			System.out.println("O número " + numero + "não foi encontrado!");

	}

}
