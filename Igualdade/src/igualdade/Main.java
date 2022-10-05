package igualdade;

public class Main {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario(1, "Teste", "111222333");
		Usuario u2 = new Usuario(1, "Teste", "111222333");
		Usuario u3 = new Usuario(1, "Teste", "111222333");
		
		System.out.println(u1 == u2);
		System.out.println(u1 == u2);

		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u3));
	}
}