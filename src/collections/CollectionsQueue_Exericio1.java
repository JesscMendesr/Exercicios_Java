package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionsQueue_Exericio1 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		String cliente;
		int op;
		Scanner reader = new Scanner(System.in);
		
		
	
			
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
			
			if (op == 0) {
				System.out.println("Obrigada por utilizar nosso sistema, volte sempre!");
				reader.close();
				System.exit(0);
			}
			
			
		
		
		
		switch (op) {
		
		}
		
		
		

	}

}
