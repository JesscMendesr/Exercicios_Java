package exercicio2_poo;

import java.util.ArrayList;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		ArrayList<Gerente> x = new ArrayList();
		ArrayList<Vendedor> y = new ArrayList();
		
		x.add(new Gerente("Jessica",'F',24,"Gerente",6000,20,"Tatuapé"));
		x.add(new Gerente("Eduardo",'M',36,"Gerente",4000,20,"Osasco"));
		x.add(new Gerente("Claudia",'F',30,"Gerente",5000,20,"Jardins"));
		
		
		
		y.add(new Vendedor("Amanda Garcia",'F',32,"Vendedora", 3000, "Manhã", 10, 15000.0f));
		y.add(new Vendedor("Gustavo Barbosa",'M',30,"Vendedora", 3000, "Noite", 10, 8000.0f));
		
		
		for (Gerente funcionarios : x ) {
			funcionarios.visualizar();
			funcionarios.calcularBonus();
		}
		
		
		
		for (Vendedor funcionarios1 : y ) {
			funcionarios1.visualizar();
			funcionarios1.calcularComissao();
		}
	}

}
