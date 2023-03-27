package exercicio2_poo;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private char sexo;
	private int idade;
	private String funcao;
	private double salario;
	public Funcionario(String nome, char sexo, int idade, String funcao, double salario) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.funcao = funcao;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	
	public void visualizar() {
		System.out.println("\n*****************************************************************");
		System.out.println("Nome: "+nome+"\nSexo: "+sexo+"\nIdade: "+idade+"\nFunção: "
	+funcao+"\nSalário: "+this.formatarMoeda());
	}
	
}
