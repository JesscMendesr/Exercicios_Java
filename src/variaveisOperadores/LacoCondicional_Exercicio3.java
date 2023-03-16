package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio3 {

	public static void main(String[] args) {
		String nomeDoador;
		int idadeDoador;
		boolean jaDoou;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nomeDoador = leia.nextLine();
		System.out.println("Digite a idade do doador: ");
		idadeDoador = leia.nextInt();
	
		
		if(idadeDoador >=18 && idadeDoador <=69) {
			if(idadeDoador > 60) {
				System.out.println("Primeira doação de sangue? ");
				jaDoou = leia.nextBoolean();
				if(jaDoou = false) {
					System.out.println(nomeDoador+" está apto(a) para doar sangue.");
				}else{
					System.out.println(nomeDoador+" não está apto(a) para doar sangue.");
				}
			}
		}else {
			System.out.println(nomeDoador+" não está apto(a) para doar sangue.");
		}
		

	}

}
