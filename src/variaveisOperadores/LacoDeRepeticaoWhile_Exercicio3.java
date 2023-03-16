package variaveisOperadores;

import java.util.Scanner;

public class LacoDeRepeticaoWhile_Exercicio3 {

	public static void main(String[] args) {
		
		int idade=0,contador1=0,contador2=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if (idade < 21 && idade >=0) {
				contador1++;
			}else if(idade > 50) {
				contador2++;
			}
			
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contador1+"\nTotal de pessoas maiores de 50 anos: "+contador2);
	}

}
