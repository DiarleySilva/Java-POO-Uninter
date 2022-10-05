package computador;

public class Notebook extends Computador{
	
	int polegadasTela;
	
	double calculaValor() {
		return GbMemoria * 250 + NumProcessadores * 500 + polegadasTela * 100;
	}

	public Notebook(int gbMemoria, int numProcessadores, int polegadasTela) {
		super(gbMemoria, numProcessadores);
		this.polegadasTela = polegadasTela;
	}
}