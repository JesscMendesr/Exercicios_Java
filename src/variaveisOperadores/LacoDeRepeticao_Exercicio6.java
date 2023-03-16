package variaveisOperadores;

import java.util.Scanner;

public class LacoDeRepeticao_Exercicio6 {

	public static void main(String[] args) {
		
		int numero,somaNumero = 0,cont = 0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 3 == 0) {
				somaNumero += numero;
				cont++;
			}
			
		}while (numero !=0 );
		media = somaNumero/cont;
		System.out.println("A média de todos os números múltiplos de 3 é : "+media);
		
	}

}
