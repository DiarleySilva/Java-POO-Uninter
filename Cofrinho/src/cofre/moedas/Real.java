package cofre.moedas;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}

	@Override
	void info() { // Retorna o valor em reais
		System.out.println("Real: R$" + valor);
	}

	@Override
	public double converter(Moeda moeda) { // Converte a moeda para reais
		return moeda.valor; // A conversão para reais é o mesmo valor
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

	@Override
	double converter() {
		return 0;
	}
}