package banco;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Conta nova = new Conta(null, 0, 0, 0, 0);
		
		int opcao;
		
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Transferir");
		System.out.println("5 - COnsultar");
		System.out.println("Digite sua opção: ");
		
		while(true){
		opcao = teclado.nextInt();
		
			if(opcao == 1) {
				nova.cadastrar();
			}
			else if(opcao == 2) {
				nova.depositar();
			}
			//else if(opcao == 3) {
				//nova.sacar();
			//}
			else if(opcao == 4) {
				nova.transferir(nova, opcao);
			}
			else if(opcao == 5) {
				nova.info();
			}
		}
	}
}