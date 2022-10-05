package cofre.moedas;

public class Dolar extends Moeda {
	
	double total;

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Dólar: $" + valor);
	}

	@Override
	public void converter() {
		double convertido = valor * 5.174;
		System.out.println("Valor convertido para Dólar: " + convertido);
		total += convertido;
	}

	@Override
	public String toString() {
		return "Dolar " + valor;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}