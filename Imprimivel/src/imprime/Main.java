package imprime;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcio = new Funcionario("Diarley", "123.321.123-44");
		Carro carro1 = new Carro("Ferrari", "Verde", 2);
		Quadrado dado = new Quadrado(8);
		
		Imprimivel i = funcio;
		i.imprimir();
		
		i = carro1;
		i.imprimir();
		
		i = dado;
		i.imprimir();
	}
}