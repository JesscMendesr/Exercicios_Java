package variaveisOperadores;

import java.util.Scanner;

public class ArrayVetor_Exercicio2 {

	public static void main(String[] args) {

		int numero[] = new int[10];
		int x,soma = 0,media;
			
		
		Scanner leia = new Scanner(System.in);

		for (x=0;x<10;x++) {
			System.out.println("Digite um número inteiro: ");
			numero[x] = leia.nextInt();
			soma += numero[x];
		}
		System.out.printf("Elementos nos índices ímpares: ");
		
		for (x=0;x<10;x++) {
			if (numero[x] % 2 != 0) {
				System.out.printf(numero[x]+" ");
			}		
			
		}
		System.out.printf("\nElementos nos índices pares: ");
		
		for (x=0;x<10;x++) {
			
			if (numero[x] % 2 == 0){
				
				System.out.printf(numero[x]+" ");
			}
		}
		
		System.out.println("\nSoma:"+soma);
		media = soma/10;
		System.out.println("Média:"+media);
	}

}
