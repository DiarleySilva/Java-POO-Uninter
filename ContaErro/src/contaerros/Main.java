package contaerros;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Conta c1 = new Conta("Diarley", 3000);
		Conta c2 = new Conta("Silva", 4000);
		
		c1.info();
		c2.info();
		
		System.out.print("Digite um valor para tranferir: ");
		double valorTransferir = teclado.nextDouble();
		
		boolean leitura = false;
		
		while(! leitura) {
			try {
				c1.transferir(valorTransferir, c2);
				System.out.println("Valor transferido com sucesso!");
				c1.info();
				c2.info();
				leitura = true;
			}
			catch(Exception erro) {
				
				System.out.println("Ocorreu um erro. Digite outro valor: ");
				System.out.println(erro.getMessage());
				
				System.out.print("Digite um valor para tranferir: ");
				valorTransferir = teclado.nextDouble();
			}
		}
		
		//c1.sacar(50000);
		//c1.info();
		
		/*try {
		c1.info();
		c1.depositar(1000);
		c1.info();
		c1.sacar(50000);
		c1.info();
		}
		catch(Exception erro){
			System.out.println("Ocorreu um erro. Digite outro valor.");
			System.out.println(erro.getMessage());
		}
		finally {
			System.out.println("Encerrando o programa...");
		}*/
	}
}