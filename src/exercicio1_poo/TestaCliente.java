package exercicio1_poo;

import java.util.ArrayList;

public class TestaCliente {

	

	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList(); 
		
		
		
		clientes.add(new Cliente("Giovana","giovana@gmail.com","Santo André","SP",44789465));
		clientes.add(new Cliente("Gustavo","gustavo@gmail.com","Fortaleza","CE",54874485));
	
		
		for (Cliente x:clientes) {
			x.imprimir();
		}
				
	}

}
