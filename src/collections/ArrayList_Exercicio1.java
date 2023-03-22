package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Exercicio1 {

	public static void main(String[] args) {
		
		ArrayList<String> minhasCores = new ArrayList();
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite cinco cores: ");
		

		for(int i=0;i<5;i++) {
			String cores = leia.nextLine();
			minhasCores.add(cores);
		}
		
		System.out.println("\nLista das cores: ");
		System.out.println(minhasCores); 
		
		Collections.sort(minhasCores);
		System.out.println("\nLista das cores em ordem alfabetica: ");
		System.out.println(minhasCores);
	}

}
