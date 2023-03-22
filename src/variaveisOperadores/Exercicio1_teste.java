/*Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um algoritmo que consiga pesquisar
 *  dados no vetor, onde o usuário irá digitar um número e o programa deve exibir na tela a posição deste número no vetor. 
 *  Caso o número não seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela. Veja os exemplos abaixo:
 */



package variaveisOperadores;

import java.util.Scanner;

public class Exercicio1_teste {

	public static void main(String[] args) {
		
		int numeros[] = new int[10],x;
		int localizador;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (x=1;x<=10;x++) {
			System.out.println("Digite o "+(x+1)+" número: ");
			numeros[x] = leia.nextInt();
		}
		
	
	System.out.println("Digite um número que deseja saber a posição: ");
	localizador = leia.nextInt();
	
	for (x=0;x<10;x++) {
		if (localizador == numeros[x]) {
			System.out.println("O número "+localizador+" está na posição "+(x+1));
		}
	}
	
	
		

	}

}
