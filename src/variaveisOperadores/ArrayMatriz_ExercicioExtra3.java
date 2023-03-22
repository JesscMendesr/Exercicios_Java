package variaveisOperadores;

import java.util.Scanner;

public class ArrayMatriz_ExercicioExtra3 {

	public static void main(String[] args) {
		
		int n1[][] = new int[2][3];
		int n2 [][] = new int [2][3];
		int m1 [][] = new int [2][3];
		int m2 [][] = new int [2][3];
		int l,j;
		
		Scanner leia = new Scanner(System.in);
			
		
		for (l=0;l<2;l++) {
			for (j=0;j<3;j++) {
				System.out.println("\nEntre com os números na matriz N1");
				n1[l][j] = leia.nextInt();
			}
		}
		
		
		for (l=0;l<2;l++) {
			for (j=0;j<3;j++) {
				System.out.println("\nEntre com os números na matriz N2");
				n2[l][j] = leia.nextInt();
			}
		}
		
		System.out.println("\nOs números da M1 serão: ");
		for (l=0;l<2;l++) {
			for (j=0;j<3;j++) {
				m1[l][j] = n1[l][j] + n2[l][j];
				System.out.println(m1[l][j]);
			}
			
		}
		
		System.out.println("\nOs números da M2 serão: ");
		for (l=0;l<2;l++) {
			for (j=0;j<3;j++) {
				m1[l][j] = n1[l][j] - n2[l][j];
				System.out.println(m1[l][j]);
			}
			
		}
		
	}

}
