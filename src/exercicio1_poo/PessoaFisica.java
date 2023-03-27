package exercicio1_poo;

public class PessoaFisica extends Cliente{
	
	private String cpf;
	private String estadoCivil;

	public PessoaFisica(String nome, String email, String cidade, String estado, String cpf, String estadoCivil) {
		super(nome, email, cidade, estado);
		this.cpf = cpf;
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("CPF: "+getCpf()+"\nEstado Civil: "+getEstadoCivil());
	}

}
