package cofre.moedas;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList(); // Cria um array para a lista de moedas
	
	// Função que adiciona moedas
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	// Função que remove moedas
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	// Função que lista as moedas
	public void listagem() {
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda);
		}
	}
	// Função que converte o total das moedas para reais
	public double totalConvertido() {
		
		double total = 0; // Variável que armazena o total
		
		for(Moeda moeda : listaMoedas) { // Percorre a lista de moedas
			total += moeda.converter(moeda);
		}
		System.out.println("Total convertido para reais: R$" + total);
		return total; // Retorna o total convertido das moedas
	}
}