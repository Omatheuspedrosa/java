import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicio03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		HashSet<Integer> valores = new HashSet<Integer>();
		int valor;
		
		for(int indice = 0; indice < 10; indice ++) {
			System.out.print("Digite o " + (indice + 1) + "° valor: ");
			valor = leia.nextInt();
			valores.add(valor);
		}
		
		System.out.println("Listar dados do Set:\n");
		
		Iterator<Integer> iValores = valores.iterator();
		
		while(iValores.hasNext()) {
			System.out.println(iValores.next());
		}

	}

}
