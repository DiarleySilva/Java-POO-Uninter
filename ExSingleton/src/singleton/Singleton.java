package singleton;

public class Singleton {
	
	public int numero;
	private static Singleton instancia = null;
	
	private Singleton() {
		numero = 20;
	}
	
	public static Singleton GetInstance() {
		if(instancia == null) {
			instancia = new Singleton();
		}
		return instancia;
	}
}