package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Exercicio1 {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		String cliente;
		int op;
		Scanner reader = new Scanner(System.in);
		
		
		do {
			
			System.out.println("\n**************************************************");
			System.out.println("\n\t\tMenu fila de clientes");
			System.out.println("\n**************************************************");
			System.out.println("\n\t(1) Adicionar Cliente na fila");
			System.out.println("\n\t(2) Listar todos os clientes");
			System.out.println("\n\t(3) Retirar cliente da fila");
			System.out.println("\n**************************************************");
			System.out.println("\n\t(0) Sair");
			System.out.println("\n**************************************************");
			System.out.println("Entre com a Opção desejada: ");
			
			
			op = reader.nextInt();
		
				 
				 switch (op) {

					case 1 :
						System.out.println("\nEntre com o nome do cliente que deseja adicionar à fila: \n");
						reader.nextLine();
						cliente = reader.nextLine();
						fila.add(cliente);
						if (fila.contains(cliente)) {
							System.out.printf("\nCliente %s adicionado à fila com sucesso!\n",cliente);
						}
						break;
						
						
					case 2: 
						System.out.println("\nLista de todos os clientes da fila: \n"+fila);
						break;
						
					case 3:
						if (fila.isEmpty()) {
							System.out.println("\nA fila está vazia!\n");
						}else {
							System.out.println("\nCliente "+fila.peek()+" compareça ao caixa!\n");
							fila.remove();
							System.out.println("\nCliente na fila atualmente: \n"+fila);
						}
						break;
						
						
						
					case 0: 
						System.out.println("Obrigada por utilizar nosso sistema de filas, volte sempre!");
						break;
						
					default:
						System.out.println("Opção inválida!");
						break;
					
					}
	
			
		}while (op != 0);

		
		
		
			
			
		
		
					
		
	}

}
