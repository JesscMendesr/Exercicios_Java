package variaveisOperadores;

import java.util.Scanner;

public class LacoCondicional_Exercicio6 {

	public static void main(String[] args) {
		String nome, cargo;
		int codigo;
		float salario, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o nome do colaborador: ");
		nome = leia.nextLine();
		System.out.println("\nDigite o código do cargo: \n(1)\tGerente\n(2)\tVendedor\n(3)\tSupervisor\n(4)\tMotorista\n(5)\tEstoquista\n(6)\tTécnico de TI");
		codigo = leia.nextInt();
		System.out.println("\nDigite o salário: ");
		salario = leia.nextFloat();
		
		
		
		switch (codigo) {
		case 1: 
			cargo = "Gerente";
			novoSalario = salario + (salario * 10) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
		case 2:
			cargo = "Vendedor";
			novoSalario = salario + (salario * 7) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
		case 3:
			cargo = "Supervisor";
			novoSalario = salario + (salario * 9) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
		case 4:
			cargo = "Motorista";
			novoSalario = salario + (salario * 6) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
		case 5:
			cargo = "Estoquista";
			novoSalario = salario + (salario * 5) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
		case 6:
			cargo = "Técnico de TI";
			novoSalario = salario + (salario * 8) / 100;
			System.out.println("\nNome do colaborador: "+nome+"\nCargo: "+cargo+"\nNovo salário: "+novoSalario);
			break;
			
		}
	}

}
