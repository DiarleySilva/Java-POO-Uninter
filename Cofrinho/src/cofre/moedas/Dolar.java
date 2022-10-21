package cofre.moedas;

public class Dolar extends Moeda {

	public Dolar(double valor) {
		super(valor);
	}

	@Override
	void info() { // Retorna o valor em dólares
		System.out.println("Dólar: $" + valor); 
	}

	@Override
	public double converter(Moeda moeda) { // Converte a moeda para a cotação do dólar
		return moeda.valor * 5.27; // A cotação do dia 12/10/2022 ás 08:20 era R$5,27
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

	@Override
	double converter() {
		return 0;
	}
}