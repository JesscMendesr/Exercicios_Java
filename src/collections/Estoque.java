package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

	public static void main(String[] args) {
		
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do {
			System.out.println("\n------------------------------------------");
			System.out.println("\n\t\tMenu do Estoque");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar os produtos do estoque?");
			System.out.println("\n(0) Deseja encerrar o programa de estoque?");
			System.out.println("\nDigite a sua opção: ");
			op = leia.nextInt();
			
			
			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigit pe o produtoara adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produtor = leia.nextLine();
				if (estoque.contains(produtor)) { // verifica se o produto existe no estoque.
					estoque.remove(produtor); // Remove o produto do estoque
				} else {
					System.out.println("\nEste produto não existe!");
				}
				System.out.println("\nProdutos no estoque: ");
				System.out.println(estoque); // Mostras todos os produtos do estoque.
				break;
				
			case 3: 
				leia.nextLine();
				System.out.println("Digite o nome do produto que deseja atualziar:");
				String verifica = leia.nextLine();
				System.out.println("Digite o nome do produto que entrará no lugar do produto: "+verifica);
				String novo = leia.nextLine();
				if (estoque.contains(verifica)) { // verifica se o produto existe no estoque.
					estoque.remove(verifica); // Remove o produto desejado.
					estoque.add(novo); // Atualiza o produto no estoque.
				} else {
					System.out.println("\nEste produto não existe!");
				}
				System.out.println("\nProdutos no estoque: ");
				System.out.println(estoque); 
				break;
				
			case 4: 
				System.out.println("\nProdutos no estoque: ");
				System.out.println(estoque); 
				break;
				
			case 0: 
				System.out.println("\nMuito obrigade por utilizar o nosso sistema... Volte sempre!");
				break;
				
				default:
					System.out.println("\nOpção inválida... Digite novamente.");
				
		}		
			
			
		}while (op != 0);
	
		

	}

}
