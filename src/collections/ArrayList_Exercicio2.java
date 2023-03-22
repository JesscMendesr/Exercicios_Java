package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Exercicio2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>(); 
		
		Scanner leia = new Scanner(System.in);
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		
		
		System.out.println("\nDigite um número inteiro: ");
		int num = leia.nextInt();
		
		boolean contem = numeros.contains(num);
		
		if (contem == false) {
			System.out.printf("O numero %d não foi encontrado!!",num);
		}else {
			System.out.println("\nO número "+num+" está na posição: "+numeros.indexOf(num));
		}
		
		
		
		

	}

}
