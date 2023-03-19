package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio8 {

	public static void main(String[] args) {
		
		float saldo=1000,saque,deposito;
		int op;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número correspondente a opção para realizar uma ação:\n\n(1)\tSaldo\n(2)\tSaque\n(3)\tDepósito");
		op = leia.nextInt();
		
		switch(op) {
		case 1: 
			System.out.println("O saldo disponível é: "+saldo);
			break;
			
		case 2:
			if(saldo > 0) {
				System.out.println("Digite o valor do saque: ");
				saque = leia.nextFloat();
				if(saque <= saldo) {
					saldo = saldo - saque;
					System.out.println("Saque de "+saque+" realizado com sucesso\nSaldo disponível: "+saldo);
				}else {
					System.out.println("Saldo insuficiente!");
				}
			}else {
				System.out.println("Saldo insuficiente para saque.\nSaldo disponível: "+saldo);
			}break;
			
		case 3:
			System.out.println("Digite o valor do depósito: ");
			deposito = leia.nextFloat();
			saldo = saldo + deposito;
			System.out.println("Depósito realizado com sucesso!\nSaldo disponível: "+saldo);
			break;
		}
		
		
	}

}
