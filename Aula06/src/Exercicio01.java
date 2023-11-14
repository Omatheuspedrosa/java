import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		
		for(int indice = 0; indice < 5; indice ++) {
			System.out.print("Informe a " + (indice + 1) + "° cor: ");
			cor = leia.next();
			cores.add(cor);
		}
		
		System.out.println("\nListar todas as cores: ");
		
		for(String indice : cores) {
			System.out.println(indice);
		}
		
		System.out.println("\nOrdenar cores: ");
		
		cores.sort(null);
		
		for(String indice : cores) {
			System.out.println(indice);
		}
	}

}
