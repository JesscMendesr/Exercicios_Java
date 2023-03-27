package exercicio2_poo;

import java.text.NumberFormat;

public class Gerente extends Funcionario {
	
	private String franquia;
	private float bonus;

	public Gerente(String nome, char sexo, int idade, String funcao, double salario, float bonus, String franquia) {
		super(nome, sexo, idade, funcao, salario);
		this.bonus = bonus;
		this.franquia = franquia;
	}

	public String getFranquia() {
		return franquia;
	}

	public void setFranquia(String franquia) {
		this.franquia = franquia;
	}

	public float getBonus() {
		return bonus;
	}

	public void setBonus(float bonus) {
		this.bonus = bonus;
	}
	
	public void calcularBonus() {
		double totalBonus = (bonus * getSalario()) / 100;
		System.out.println("O total de Bônus a receber será de: "+totalBonus);
	}
	
	
	
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Franquia: "+this.franquia);
		
	}
	
}
