package imprime;

public class Funcionario implements Imprimivel{
	
	String nome, cpf;

	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public void imprimir() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
	}
}