package variaveisOperadores;

import java.util.Scanner;

public class LacoDeRepeticao_Exercicio2 {

	public static void main(String[] args) {
		
		int numero,x,soma,par = 0,impar = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x <=10;x++) {
			System.out.println("Digite o "+x+"º Numero:");
			numero = leia.nextInt();
			
			if(numero % 2 == 0) {
				par++;
			}else {
				impar++;
			}
			
		}
		System.out.println("\nTotal de números ímpares: "+impar+"\nTotal de números pares: "+par);
	}

}
