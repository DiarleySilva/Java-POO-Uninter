package formas;

import java.util.Scanner;

public abstract class FormaGeometrica {
	
	public double area;
	public abstract void CalculoArea();
	
	class Quadrado extends FormaGeometrica {
		
		public void CalculoArea() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite a medida do lado: ");
		double lado = teclado.nextDouble();
		area = lado * lado;
		}
	}
}