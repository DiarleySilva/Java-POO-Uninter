package cofre.moedas;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}

	@Override
	void info() { // Retorna o valor em dólares
		System.out.println("Euro: " + valor);
	}

	@Override
	public double converter(Moeda moeda) { // Converte a moeda para a cotação do euro
		return moeda.valor * 5.11; // A cotação do dia 12/10/2022 ás 08:20 era R$5,11 
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

	@Override
	double converter() {
		return 0;
	}
}