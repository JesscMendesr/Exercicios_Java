package variaveisOperadores;

import java.util.Scanner;

public class ArrayVetor_Exercicio1 {

	public static void main(String[] args) {
	
		int numero[] = new int[10];
		int x = 0,controlador=0,localizador,cont = 0;
		int num,l,novoNumero, jaTem;
			
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nInsira 10 números inteiros, não ordenados e não repetidos:");
		
		System.out.println("\nDigite um numero:");
		numero[0] = leia.nextInt();
		jaTem = numero[0];

		
		for(x=1;x<10;x++) {
			System.out.println("\nDigite o "+(x+1)+" numero:");
			numero[x] = leia.nextInt();
		
		}
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		localizador = leia.nextInt();
		
		for (x=0;x<10;x++) {
		if (numero[x] == localizador) {
			System.out.println("\nO número "+localizador+" está localizado na posição: "+(x+1));
			cont++;
		}
			
		
		}
		if(cont == 0) {
			System.out.println("\nO número não existe nesta matriz.");
		}
	}
		

}
