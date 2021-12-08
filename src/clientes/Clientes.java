package clientes;


public class Clientes {
		
	protected String nome;
	protected String cpf;
	protected String placaAluguel;

	public Clientes(String nome, String cpf, String placaAluguel)
	{
		this.nome = nome;
		this.cpf = cpf;
		this.placaAluguel = placaAluguel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String  getPlacaAluguel() {
		return placaAluguel;
	}
	public void setPlacaAluguel(String placaAluguel) {
		this.placaAluguel = placaAluguel;
	} 
	
	public String toString()
	{
			return "Nome: " + nome + "\nCPF: " + cpf+"\n";	
	}	
	
}
