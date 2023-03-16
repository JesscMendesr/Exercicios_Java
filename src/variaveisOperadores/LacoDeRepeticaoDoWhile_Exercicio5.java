package variaveisOperadores;

import java.util.Scanner;

public class LacoDeRepeticaoDoWhile_Exercicio5 {

	public static void main(String[] args) {
		
		int numero,somaPositivos=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um Número: ");
			numero = leia.nextInt();
			if (numero >= 0) {			
				somaPositivos += numero;
			}
		} while(numero != 0);
		
		System.out.println("A soma dos números positivos é: "+somaPositivos);

	}

}
