package exercicio5_herenca;

public class Ingresso {
	
	private String comprador;
	private String setor;
	private String assento;
	private float valor;
	private int numeroVenda;
	private String tipo;
	
	

	public Ingresso(String comprador, String setor, String assento, float valor, int numeroVenda, String tipo) {
		super();
		this.comprador = comprador;
		this.setor = setor;
		this.assento = assento;
		this.valor = valor;
		this.numeroVenda = numeroVenda;
		this.tipo = tipo;
	}

	public String getComprador() {
		return comprador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setComprador(String comprador) {
		this.comprador = comprador;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getAssento() {
		return assento;
	}

	public void setAssento(String assento) {
		this.assento = assento;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getNumeroVenda() {
		return numeroVenda;
	}

	public void setNumeroVenda(int numeroVenda) {
		this.numeroVenda = numeroVenda;
	}
	
	
	public void imprimirInfo() {
		System.out.println("\n*******************************************************");
		System.out.println("Detalhes do ingresso: ");
		System.out.println("Nome do(a) comprador(a): "+this.comprador);
		System.out.println("Setor: "+this.setor);
		System.out.println("Assento: "+this.assento);
		System.out.println("Valor Total: "+this.valor);
		System.out.println("Numero da venda: "+this.numeroVenda);
		System.out.println("Tipo de Ingresso: \n"+this.tipo);
	}
	

}
