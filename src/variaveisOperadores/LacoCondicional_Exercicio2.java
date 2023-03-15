package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio2 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		number = leia.nextInt();
		
		if (number % 2 == 0 && number > 0) {
			System.out.println("O número "+number+" é par e positivo.");
		}else if (number % 2 == 0 && number < 0) {
			System.out.println("O número "+number+" é par e negativo.");
		}else if(number > 0){
			System.out.println("O número "+number+" é impar e positivo.");
		}else {
			System.out.println("O número "+number+" é impar e negativo.");
		}

	}

}
