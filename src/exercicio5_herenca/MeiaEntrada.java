package exercicio5_herenca;

public class MeiaEntrada extends Ingresso {

	private String documentoMeia;
	private String tipoMeia;
	private float taxa;
	
	
	public MeiaEntrada(String comprador, String setor, String assento, float valor, int numeroVenda, String tipo,
			String documentoMeia, String tipoMeia, float taxa) {
		super(comprador, setor, assento, valor, numeroVenda, tipo);
		this.documentoMeia = documentoMeia;
		this.tipoMeia = tipoMeia;
		this.taxa = taxa;
	}


	public String getDocumentoMeia() {
		return documentoMeia;
	}


	public void setDocumentoMeia(String documentoMeia) {
		this.documentoMeia = documentoMeia;
	}


	public String getTipoMeia() {
		return tipoMeia;
	}


	public void setTipoMeia(String tipoMeia) {
		this.tipoMeia = tipoMeia;
	}


	public float getTaxa() {
		return taxa;
	}


	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
	
	public void imprimirInfo() {
		super.imprimirInfo();
		System.out.println("Documento da Meia Entrada: "+this.documentoMeia);
		System.out.println("Tipo de Meia Entrada: "+this.tipoMeia);
		System.out.println("Taxa: "+this.taxa);
	}
	
}
