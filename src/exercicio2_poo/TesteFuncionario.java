package exercicio2_poo;

import java.util.ArrayList;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		ArrayList<Funcionario> x = new ArrayList();
		
		x.add(new Funcionario("Jessica",'F',24,"Java Developer Pleno",6000));
		x.add(new Funcionario("Paulo",'M',32,"Java Developer Senior",10000));
		x.add(new Funcionario("Luiza",'F',22,"Java Develope Junior",4000));
		
		for (Funcionario y:x) {
			y.visualizar();
		}
	}

}
