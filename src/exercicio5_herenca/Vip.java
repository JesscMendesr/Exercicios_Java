package exercicio5_herenca;

public class Vip extends Ingresso {

	
	private int camarote;
	private boolean bebida;
	private boolean jantar;
	
	
	public Vip(String comprador, String setor, String assento, float valor, int numeroVenda, String tipo, int camarote,
			boolean bebida, boolean jantar) {
		super(comprador, setor, assento, valor, numeroVenda, tipo);
		this.camarote = camarote;
		this.bebida = bebida;
		this.jantar = jantar;
	}


	public int getCamarote() {
		return camarote;
	}


	public void setCamarote(int camarote) {
		this.camarote = camarote;
	}


	public boolean isBebida() {
		return bebida;
	}


	public void setBebida(boolean bebida) {
		this.bebida = bebida;
	}


	public boolean isJantar() {
		return jantar;
	}


	public void setJantar(boolean jantar) {
		this.jantar = jantar;
	}
	
	
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Camarote: "+this.camarote);
		System.out.println("Bebida: "+this.bebida);
		System.out.println("Jantar: "+this.jantar);
	}
	
}
