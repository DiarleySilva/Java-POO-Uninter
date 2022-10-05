package computador;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Desktop compA = new Desktop(16, 6, 250);
		Notebook compB = new Notebook(8, 4, 15);
		
		Computador comp;
		
		ArrayList<Computador> listaComp = new ArrayList();
		
		listaComp.add(compA);
		listaComp.add(compB);
		listaComp.add(new Desktop(16, 4, 600));
		listaComp.add(new Notebook(8, 4, 15));
		
		double total = 0;
		
		for(Computador c : listaComp) {
			total += c.calculaValor();
		}
		System.out.print(total);

		
		/*comp = compA;
		System.out.println("Valor: " + comp.calculaValor());
		comp = compB;
		System.out.println("Valor: " + comp.calculaValor());*/
	}
}