package erros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um valor entre 0 e 10: ");
		int valor = teclado.nextInt();
		
		if(valor > 10 || valor < 0) {
			throw new RuntimeException("Valor invalido."); 
		}
	}
}