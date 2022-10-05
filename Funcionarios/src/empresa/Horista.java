package empresa;

public class Horista extends Funcionario{
	
	int totalHoras;
	float valorHora;
	
	public Horista(String nome, int totalHoras, float valorHora) {
		super(nome);
		this.totalHoras = totalHoras;
		this.valorHora = valorHora;
	}
	
	public float pagamento(){
		return totalHoras * valorHora;
	}
}