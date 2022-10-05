package banco;

public class Conta {
	
	String correntista;
	float saldo, limiteSaque;
	
	void sacar(float valor) {
		if(valor > saldo || valor > limiteSaque) {
			System.out.println("Saque não permitido!");
		}
		saldo -= valor;
	}
	
	void depositar(float valor) {
		saldo += valor;
	}
	
	void info() {
		System.out.println("Nome: " + correntista);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limiteSaque);
	}
	
	void transferir(Conta contaNova, float valor) {
		if(valor > saldo || valor > limiteSaque) {
			System.out.println("Transferência não permitida!");
		}
		saldo -= valor;
		contaNova.saldo += valor; 
	}
}