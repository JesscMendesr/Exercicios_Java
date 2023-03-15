package variaveisOperadores;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nA media final das notas será: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAlune Aprovade!");
		}else if(media>=5 && media<7){
			System.out.println("\nAlune de exame!");
		}else {
			System.out.println("\nAlune reprovade!");
		}
		
	}

}
