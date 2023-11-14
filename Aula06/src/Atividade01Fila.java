import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade01Fila {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		
		String nome;
		
		while (true){
		
		System.out.println("*****************************************");
		System.out.println("                                         ");
		System.out.println("      1 - Adicionar Cliente na Fila      ");
		System.out.println("      2 - Listar todos os Cientes      ");
		System.out.println("      3 - Retirar cliente da fila      ");
		System.out.println("      0 - Sair      ");
		System.out.println("*****************************************");
		System.out.println("Digite a opção desejada:                 ");
		System.out.println("                                         ");
		
		opcao = leia.nextInt();
		
		if(opcao == 0) {
			System.out.println("\nPrograma finalizado");
			System.exit(0);
		}
		
		switch (opcao) {
		case 1:
			System.out.println("\nAdicionar Cliente na Fila\n\n");
			
			System.out.println("\nDigie o nome do Cliente: ");
			leia.skip("\\R");
			nome = leia.nextLine();
			
			fila.add(nome);
			
			System.out.println("\nCliente adiocionado na fila!");
			
			break;
			
		case 2:
			System.out.println("\nListar todos os clientes na Fila\n\n");
			
			Iterator<String> iFila = fila.iterator();
			
			while(iFila.hasNext())
				System.out.println(iFila.next());
			
			break;
			
		case 3:
			
			System.out.println("\nRemover Cliente na Fila\n\n");
			
			if(fila.isEmpty())
				System.out.println("\nA fila se encontra vazia");
			else {
				fila.remove();
				System.out.println("\nCliente retirado da fila");
			}
			
			break;
			
		default:
			System.out.println("\nOpção Inválida");
			break;
		}

	}
	}

}
