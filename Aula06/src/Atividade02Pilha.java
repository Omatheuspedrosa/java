import java.util.Scanner;
import java.util.Stack;

public class Atividade02Pilha {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		int opcao ;
		String nome;
		boolean repetir = true;
		
		while(repetir == true) {
			System.out.println("************************************");
			System.out.println("    1 - Adicionar Livro na Pilha    ");
			System.out.println("    2 - Listar todos os Livros      ");
			System.out.println("    3 - Retirar o Livro da Pilha    ");
			System.out.println("    0 - Sair                        ");
			System.out.println("************************************");
			
			System.out.print("Entre com a posição desejada: ");
			opcao = leia.nextInt();
			
			switch(opcao){
			
			case 0:
				repetir = false;
				System.out.println("Programa finalizado!");
				break;
			
			case 1:
				System.out.print("Informe o nome do livro: ");
				leia.skip("\\R");
				nome = leia.nextLine();
				livros.add(nome);
				System.out.println("Livro adicionado!");
				break;
			case 2:
				if(livros.isEmpty())
					System.out.println("\nLista vazia!");
				else
					System.out.println(livros);
				break;
				
			case 3:
				if(livros.isEmpty())
					System.out.println("\nLista vazia!");
				else
					livros.pop();
			}
			
		}
	}

}
