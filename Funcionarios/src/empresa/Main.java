package empresa;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionarios[] = {	new Assalariado("Teste", 2200),
										new Horista("Teste3", 40, 15.5f),
										new Comissionado("Teste1", 200, 30.5f)};
		
		Funcionario f;
		float total = 0;
		for(int i = 0; i < funcionarios.length; i++) {
			f = funcionarios[i];
			System.out.println(f.nome + " Salario: R$" + f.pagamento());
			total += f.pagamento();
			}
		
		System.out.println("Total a pagar: R$" + total);
	}
}