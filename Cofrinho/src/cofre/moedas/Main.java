package cofre.moedas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opcao, tipoMoeda; 
		
		Cofrinho cofre = new Cofrinho();
		
		Moeda moeda = null;
		
		Scanner teclado = new Scanner(System.in); // Scanner para entrada de dados
		
		// Menu de opções 
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar");
		System.out.println("4 - Converter");
		System.out.println("0 - Sair");
		System.out.print("Escolha um opção: ");
		opcao = teclado.nextInt();
		
		while(opcao!=0) { // Se a opção for diferente de 0, o programa irá encerrar
			
			switch (opcao) {
			case 1: // Se a opção for 1, entrará no switch para adicionar moedas
				
				tipoMoeda = 0;
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				System.out.println("0 - Voltar");
				System.out.print("Qual moeda deseja adicionar: ");
				tipoMoeda = teclado.nextInt();
				
				if(tipoMoeda == 1) {
					System.out.print("Quanto deseja adicionar em reais(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 2) {
					System.out.print("Quanto deseja adicionar em dólares(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 3) {
					System.out.print("Quanto deseja adicionar em euros(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Euro(valor);
					cofre.adicionar(moeda);
					System.out.println("Moeda adicionada com sucesso!");
				}
				else if(tipoMoeda == 0) {
					break;
				}
				break;
			case 2: // Se a opção for 2, entrará na opção de remover moedas
				
				tipoMoeda = 0;
				System.out.println("1 - Real");
				System.out.println("2 - Dólar");
				System.out.println("3 - Euro");
				System.out.println("0 - Voltar");
				System.out.print("Qual moeda deseja remover: ");
				tipoMoeda = teclado.nextInt();
				
				if(tipoMoeda == 1) {
					System.out.print("Quanto deseja remover em reais(R$): ");
					double valor = teclado.nextDouble();
					moeda = new Real(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
				else if(tipoMoeda == 2) {
					System.out.print("Quanto deseja remover em dólares($): ");
					double valor = teclado.nextDouble();
					moeda = new Dolar(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
				else if(tipoMoeda == 3) {
					System.out.print("Quanto deseja remover em euros(€): ");
					double valor = teclado.nextDouble();
					moeda = new Euro(valor);
					cofre.remover(moeda);
					System.out.println("Moeda removida com sucesso!");
				}
			case 3: // Se a opção for 3, entrará na opção de listar moedas
				cofre.listagem();
				break;
			case 4: // Se a opção for 3, entrará na opção de mostrar o total convertido das moedas
				cofre.totalConvertido();
			}
			// Após escolher um opção, o menu será exibido novamente para escolher uma nova opção
			System.out.println("1 - Adicionar");
			System.out.println("2 - Remover");
			System.out.println("3 - Listar");
			System.out.println("4 - Converter");
			System.out.println("0 - Sair");
			System.out.print("Escolha um opção: ");
			opcao = teclado.nextInt();
		}
	}
}