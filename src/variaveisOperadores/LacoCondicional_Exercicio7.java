package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio7 {

	public static void main(String[] args) {
		float numero1, numero2, resultado;
		int codigo;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o 1º Número: ");
		numero1 = leia.nextFloat();
		System.out.println("\nDigite o 2º Número: ");
		numero2 = leia.nextFloat();
		System.out.println("\n(1)\tSoma\n(2)\tSubtração\n(3)\tMultiplicação\n(4)\tDivisão\nDigite o código da operação que deseja: ");
		codigo = leia.nextInt();
		if (codigo > 4) {
			System.out.println("\nOperação Inválida!");
			return;
		}
		
		
		switch (codigo) {
			case 1:
				resultado = numero1 + numero2;
				System.out.println("\nResultado: \n"+numero1+" + "+numero2+" = "+resultado);
				break;
			case 2: 
				resultado = numero1 - numero2;
				System.out.println("\nResultado: \n"+numero1+" + "+numero2+" = "+resultado);
				break;
			case 3:
				resultado = numero1 * numero2;
				System.out.println("\nResultado: \n"+numero1+" + "+numero2+" = "+resultado);
				break;
			case 4:
				resultado = numero1 / numero2;
				System.out.println("\nResultado: \n"+numero1+" + "+numero2+" = "+resultado);
				break;
		}
	}

}
