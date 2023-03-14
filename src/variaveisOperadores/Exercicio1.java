package variaveisOperadores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario,abono,novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário: ");
		salario = leia.nextDouble();
		System.out.println("\nDigite o valor o abono: ");
		abono = leia.nextDouble();
		
		novoSalario = salario + abono;
		
		System.out.println("\nO valor do novo salário será: "+novoSalario+" reais.");
	}

}
