package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio1 {

	public static void main(String[] args) {
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero A: ");
		a = leia.nextInt();
		System.out.println("Digite o numero B: ");
		b = leia.nextInt();
		System.out.println("Digite o numero C: ");
		c = leia.nextInt();
		
		
		if (a+b > c) {
			System.out.println("A soma de "+a+" + "+b+" é maior do que "+c);
		}else if(a+b < c) {
			System.out.println("A soma de "+a+" + "+b+" é menor do que "+c);
		}else {
			System.out.println("A soma de "+a+" + "+b+" é igual a "+c);
		}

	}

}
