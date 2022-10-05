package cofre.moedas;

public class Real extends Moeda{
	
	double total;

	public Real(double valor) {
		super(valor);
	}

	@Override
	void info() {
		System.out.println("Real: R$" + valor);
	}

	@Override
	void converter() {
	}

	@Override
	public String toString() {
		return "Real " + valor;
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