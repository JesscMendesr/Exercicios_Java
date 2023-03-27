package exercicio1_poo;

public class PessoaJuridica extends Cliente{
	
	private String razaoSocial;
	private String cnpj;

	public PessoaJuridica(String nome, String email, String cidade, String estado, String razaoSocial, String cnpj) {
		super(nome, email, cidade, estado);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CNPJ: "+getCnpj()+"\nRazão Social: "+getRazaoSocial());
	}

}
