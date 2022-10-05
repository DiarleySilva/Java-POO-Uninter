package banco;

public class Main {

	public static void main(String[] args) {
		
		Conta teste = new Conta();
		Conta teste1 = new Conta();
		
		teste.correntista = "Diarley";
		teste.saldo = 1000f;
		teste.limiteSaque = 500f;
		
		teste1.correntista = "Yelraid";
		teste1.saldo = 1000f;
		teste1.limiteSaque = 500f;
		
		teste.transferir(teste1, 600f);
		
		teste.info();
		teste1.info();
	}
}