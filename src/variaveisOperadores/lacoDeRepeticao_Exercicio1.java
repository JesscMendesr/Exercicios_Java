package variaveisOperadores;

import java.util.Scanner;

public class lacoDeRepeticao_Exercicio1 {

	public static void main(String[] args) {
		
		int primeiroNumero,ultimoNumero,x,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("Entre com o primeiro número: ");
		primeiroNumero = leia.nextInt();
		System.out.println("Entre com o ultimo número: ");
		ultimoNumero = leia.nextInt();
		
		
		
		if(primeiroNumero < ultimoNumero) {
			for (x=primeiroNumero; x<ultimoNumero; x++) {
				if (x % 3 == 0 && x % 5 == 0) {
					System.out.println(x+" É múltiplo de 3 e 5.");
					y++;
					}
				}if (y == 0) {
					System.out.println("Não existem números múltiplos de 3 e 5.");
				}
			}else {
				System.out.println("Intervalo inválido!");
			}
		
		}
	}

