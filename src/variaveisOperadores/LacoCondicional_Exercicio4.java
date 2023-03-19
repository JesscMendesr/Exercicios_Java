package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3, animal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite três caractéristicas para localizar o animail: ");
		System.out.println("\nCaracterística 1 :");
		palavra1 = leia.nextLine();
		System.out.println("\nCaracterística 2 :");
		palavra2 = leia.nextLine();
		System.out.println("\nCaracterística 3 :");
		palavra3 = leia.nextLine();
		
		
		if(palavra1.equalsIgnoreCase("Vertebrado")) {
			if(palavra2.equalsIgnoreCase("Ave")) {
				if (palavra3.equalsIgnoreCase("Carnivoro")) {
					System.out.println("\nO animal é uma Águia!");
				}else {
					System.out.println("\nO animal é uma Pomba!");
				}
			}else {
				if (palavra3.equalsIgnoreCase("Onivoro")) {
					System.out.println("\nO animal é um homem!");
				}else {
					System.out.println("\nO animal é uma vaca!");
				}
			}
		}else {
			if (palavra2.equalsIgnoreCase("Inseto")) {
				if (palavra3.equalsIgnoreCase("Hematofago")) {
					System.out.println("\nO animal é uma pulga!");
				}else {
					System.out.println("\nO animal é uma Lagarta!");
				}
			}else {
				if (palavra3.equalsIgnoreCase("Hematofago")) {
					System.out.println("\nO animal é uma Sanguessuga!");
				}else {
					System.out.println("\nO animal é uma Minhoca!");
				}
			}
		}

	}

}
