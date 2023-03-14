package variaveisOperadores;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float salarioBruto, adcNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salário bruto: ");
		salarioBruto = leia.nextFloat();
		System.out.println("\nDigite o valor do adicional noturno: ");
		adcNoturno = leia.nextFloat();
		System.out.println("\nDigite o valor de horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("\nDigite o valor de descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adcNoturno + (horasExtras * 5) - descontos;
		
		System.out.println("\nO valor do salário líquido será de: "+salarioLiquido+" reais");
		
	}
}
