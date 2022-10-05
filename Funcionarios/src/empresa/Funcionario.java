package empresa;

public abstract class Funcionario {
	String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}
	
	public Funcionario() {}
	
	public abstract float pagamento(); 
	//{
	//	System.out.println("Processando pagamento...");
	//	return 0.0f;
	//}
}