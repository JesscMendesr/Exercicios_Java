package exercicio2_poo;

public class Vendedor extends Funcionario {

	private String turno;
	private int comissao;
	private float totalDeVendas;
	
	public Vendedor(String nome, char sexo, int idade, String funcao, double salario, String turno, int comissao, float totalDeVendas) {
		super(nome, sexo, idade, funcao, salario);
		this.comissao = comissao;
		this.turno = turno;
		this.totalDeVendas = totalDeVendas;
		
		
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}

	public float getTotalDeVendas() {
		return totalDeVendas;
	}

	public void setTotalDeVendas(float totalDeVendas) {
		this.totalDeVendas = totalDeVendas;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Turno: "+turno+"\nTotal de Vendas: "+this.totalDeVendas);
	}
	
	public void calcularComissao() {
		
		float totalComissao = (totalDeVendas * comissao) / 100;
		System.out.println("O valor total de comissão a receber será de: "+totalComissao);
	}
	
}
