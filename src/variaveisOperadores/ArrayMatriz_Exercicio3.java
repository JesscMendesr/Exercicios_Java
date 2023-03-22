package variaveisOperadores;

import java.util.Scanner;

public class ArrayMatriz_Exercicio3 {

	public static void main(String[] args) {
		int numero[][] = new int[3][3];
		int vetor[] = new int[3];
		int linha,coluna,somaPrincipal = 0,somaSecundaria = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.println("Entre com os números da matriz: ");
				numero[linha][coluna] = leia.nextInt();
				}
				
			}
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				if (linha == coluna) {
					System.out.println("Elementos da Diagonal Principal: "+numero[linha][coluna]);
				somaPrincipal +=numero[linha][coluna];
				}
					
				}
			}
		for (linha=0; linha<3; linha++) {
			for (coluna=0; coluna<3; coluna++) {
				if (coluna + linha == numero.length - 1) {
					System.out.println("Os numeros da diagonal Secundaria são: "+numero[linha][coluna]);
					somaSecundaria += numero[linha][coluna];
				}
			}
		
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: "+somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Principal: "+somaSecundaria);
		}
		

	

}
