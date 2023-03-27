package exercicio1_poo;

import java.util.ArrayList;

public class TestaCliente {

	

	public static void main(String[] args) {
		
		ArrayList<PessoaFisica> clientesF = new ArrayList(); 
		
		ArrayList<PessoaJuridica> clientesJ = new ArrayList(); 
		
		
		clientesF.add(new PessoaFisica("Maria da Silva","maria@hotmail.com","São Paulo","SP","148856321454","Casada"));
		clientesF.add(new PessoaFisica("Gustavo Santos","gustavo_santos@hotmail.com","Campinas","SP","47852163212","Solteiro"));
		
		clientesJ.add(new PessoaJuridica("Papelaria Odin","papelaria_odin@hotmail.com","São Paulo","SP","PAPEIS E VARIEDADES LTDA","45164656/85846"));
		clientesJ.add(new PessoaJuridica("Kalunga","kalunga@hotmail.com","Brasília","DF","KALUNGA COMERCIO E INDUSTRIA GRAFICA LTDA","4787596223/13186"));
	
		
		for (PessoaFisica x:clientesF) {
			x.visualizar();
		}
		
		
		for (PessoaJuridica x:clientesJ) {
			x.visualizar();
		}
				
	}

}
