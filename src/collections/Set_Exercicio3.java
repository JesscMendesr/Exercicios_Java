package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Set_Exercicio3 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nDigite 10 números inteiros não repetidos: ");
		
		for (int i=0;i<10;i++) {
			Integer num = leia.nextInt();
			numeros.add(num);
		}System.out.println("\nLista de números set: "+numeros);

		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		
		while (iNumeros.hasNext()) {
			System.out.println("Lista de números iterator: "+iNumeros.next());
		}
		

	}

}
