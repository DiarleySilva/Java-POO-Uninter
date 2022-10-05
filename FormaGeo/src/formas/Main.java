package formas;

public class Main {

	public static void main(String[] args) {
		FormaGeometrica forma;
		
		forma = new Circulo();
		forma.CalculoArea();
		System.out.println(forma.area);
		
		forma = new Quadrado();
		forma.CalculoArea();
		System.out.println(forma.area);
	}

}
