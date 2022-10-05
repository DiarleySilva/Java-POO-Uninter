package computador;

public abstract class Computador {
	
	int GbMemoria, NumProcessadores;
	
	abstract double calculaValor();

	public Computador(int gbMemoria, int numProcessadores) {
		super();
		GbMemoria = gbMemoria;
		NumProcessadores = numProcessadores;
	}
}