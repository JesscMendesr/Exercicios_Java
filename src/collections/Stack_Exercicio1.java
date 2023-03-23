package collections;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Exercicio1 {

	public static void main(String[] args) {
		
		Stack<String> livros = new Stack<String>();
		int op;
		
		Scanner reader = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\n**************************************************");
			System.out.println("\n\t\tPilha de Livros");
			System.out.println("\n**************************************************");
			System.out.println("\n\t(1) Adicionar um novo Livro na Pilha.");
			System.out.println("\n\t(2) Listar todos os Livros da Pilha.");
			System.out.println("\n\t(3) Retirar um Livro da Pilha.");
			System.out.println("\n**************************************************");
			System.out.println("\n\t(0) Sair");
			System.out.println("\n**************************************************");
			System.out.println("Entre com a Opção desejada: ");
			op = reader.nextInt();
			
			
			switch (op) {
			case 1:
				System.out.println("\nDigite o nome do livro que deseja adicionar à pilha: \n");
				reader.nextLine();
				String nomeLivro = reader.nextLine();
				livros.push(nomeLivro);
				System.out.println("\nPilha: "+livros);
				break;
				
			case 2: 
				System.out.println("\nLista de todos os Livros na pilha: \n"+livros);
				break;
				
			case 3:
	
				if (livros.isEmpty()) {
					System.out.println("\nA pilha está vazia!\n");
				}else {
					livros.pop();
					System.out.println("\nLivro removido da pilha!\n"+livros);
				}
				break;
				
			case 0:
				System.out.println("Obrigada por utilizar nosso sistema de pilha, volte sempre! \n");
				break;
				
			default:
				System.out.println("\nOpção inválida!\n");
				break;
			}
			
			
			
		}while (op != 0);
		
		

	}

}
