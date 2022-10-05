package imprime;

public class Quadrado implements Imprimivel{
	
	int medidaLado;

	public Quadrado(int medidaLado) {
		super();
		this.medidaLado = medidaLado;
	}

	@Override
	public void imprimir() {
		System.out.println("Medida do lado: " + medidaLado);
	}
}