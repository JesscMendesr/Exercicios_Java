package variaveisOperadores;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMatriz_Exercicio4 {

	public static void main(String[] args) {
		float notas[][] = new float[10][4];
		float medias[] = new float[10];
		int l,c;
		
		Scanner leia = new Scanner(System.in);
		
		for (l=0;l<10;l++) {
			float soma = 0;
			System.out.println("\nEntre com as notas do "+(l+1)+" alune: ");
			for (c=0;c<4;c++) {
				
				System.out.println("\nEntre com a nota "+(c+1)+":");
				notas[l][c] = leia.nextFloat();
				
				soma = soma + notas[l][c];
	
				}
		
				medias[l] = soma/4;
		}
		
	    Arrays.sort(medias);
		
		for(l=0;l<10;l++) {
			System.out.println("\nMedia dos alunes "+(l+1)+": "+medias[l]);
		}
			
		
	}

}
