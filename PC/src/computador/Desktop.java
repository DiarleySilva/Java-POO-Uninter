package computador;

public class Desktop extends Computador {
	
	double acessorios;
	
	double calculaValor() {
		return GbMemoria * 200 + NumProcessadores * 400 + acessorios;
	}

	public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
		super(gbMemoria, numProcessadores);
		this.acessorios = acessorios;
	}
}