package animais;

public class Main {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Animal animal1 = new Gato();
		
		gato.emitirSom();
		animal1.emitirSom();
		
		gato.dormir();
		animal1.dormir();
		
	}

}