package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio5 {

	public static void main(String[] args) {
		int codigoItem, quantidade;
		double preco, valorTotal=0;
		String nomeProduto = "";
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n\t\tLista de produtos\n1 - Cachorro Quente\n2 - X-Salada\n3 - X-Bacon\n4 - Bauru\n5 - Refrigerante\n6 - Suco de Laranja");
		System.out.println("Digite o codigo do item: ");
		codigoItem = leia.nextInt();
		System.out.println("Digite a quatidade: ");
		quantidade = leia.nextInt();
		
		
		switch(codigoItem) {
		case 1: 
			preco = 10.0; 
			nomeProduto = "Cachorro Quente";
			valorTotal = preco * quantidade;
			break;
		case 2:
			preco = 15.0; 
			nomeProduto = "X-Salada";
			valorTotal = preco * quantidade;
			break;
		case 3:
			preco = 18.0; 
			nomeProduto = "X-Bacon";
			valorTotal = preco * quantidade;
			break;
		case 4:
			preco = 12.0; 
			nomeProduto = "Bauru";
			valorTotal = preco * quantidade;
			break;
		case 5:
			preco = 8.0; 
			nomeProduto = "Refrigerante";
			valorTotal = preco * quantidade;
			break;
		case 6:
			preco = 13.0; 
			nomeProduto = "Suco de laranja";
			valorTotal = preco * quantidade;
			break;

		}
	
		
		System.out.println("Produto: "+nomeProduto+"\nValor total: "+valorTotal);
		
		
	}

}
