package exercicio1_poo;

public class Cliente {

	private String nome;
	private String email;
	private String cidade;
	private String estado;
	private int cpf;
	
	
	
	public Cliente(String nome, String email, String cidade, String estado, int cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
		this.cpf = cpf;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	
	
	public void imprimir() {
		System.out.println("\nNome: "+nome+"\nE-mail: "+email+"\nCidade: "+cidade+"\nEstado: "+estado+"\nCPF: "+cpf);
	}
	
	
	
}







