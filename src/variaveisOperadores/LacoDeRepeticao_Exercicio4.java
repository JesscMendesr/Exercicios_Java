package variaveisOperadores;

import java.util.Scanner;

public class LacoDeRepeticao_Exercicio4 {

	public static void main(String[] args) {
		
		int idade, sexo, categoria,cont1 = 0,cont2=0,cont3=0,cont4=0;
		char continuar;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		
		
		System.out.println("\nCadastrar colaboradore? \n(S/N)");
		continuar = leia.next().charAt(0);
		
		while (continuar == 'S') {
			System.out.println("Entre com a idade: ");
			idade = leia.nextInt();
			System.out.println("\nEntre com o número referente ao sexo: \n1 - Masculino\n2 - Feminino\n3 - Outros");
			sexo = leia.nextInt();
			System.out.println("\nEntre com o número referente à categoria: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack");
			categoria = leia.nextInt();
			System.out.println("\nDeseja adicionar mais um calaboradore? (S/N)");
			continuar = leia.next().charAt(0);
			
			if(categoria == 1) {
				cont1++;
			}else if (sexo == 2 && categoria == 2) {
				cont2++;
			}else if (sexo == 1 && categoria == 3 && idade > 40) {
				cont3++;
			}else if (sexo == 2 && categoria == 4 && idade < 30) {
				cont4++;
			}	
		
			
		} 
		
		System.out.println(cont1+" pessoas desenvolvedoras Backend");
		System.out.println(cont2+" mulheres desenvolvedoras Frontend");
		System.out.println(cont3+" homens desenvolvedores Mobile maiores de 40 anos");
		System.out.println(cont4+" mulheres desenvolvedoras FullStack menores de 30 anos");

	}

}
