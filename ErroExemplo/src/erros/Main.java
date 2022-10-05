package erros;

public class Main {

	public static void main(String[] args) {
		
		int numeros[] = {1,2,3};
		
		try {
			System.out.println(numeros[10]);
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Fora de memória.");
		}
		catch (Exception e) {
			System.out.println("Ocorreu um problema: " + e.getMessage());
		}
		finally {
			System.out.println("Encerrando o programa...");
		}
	}
}