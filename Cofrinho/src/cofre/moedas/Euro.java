package cofre.moedas;

public class Euro extends Moeda{
	
	double total;

	public Euro(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Euro: " + valor);
	}

	@Override
	void converter() {
		double convertido = valor * 0.193;
		System.out.println("Valor convertido para Euro: " + convertido);
		total += convertido;
	}

	@Override
	public String toString() {
		return "Euro " + valor;
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