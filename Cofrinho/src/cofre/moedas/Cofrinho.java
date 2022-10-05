package cofre.moedas;

import java.util.ArrayList;

public class Cofrinho {
	
	ArrayList<Moeda> listaMoedas = new ArrayList();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	public void listagem() {
		for(Moeda moeda : listaMoedas) {
			System.out.println(moeda);
		}
	}
	public void totalConvertido(Moeda moeda) {
		moeda.converter();
	}
	
}