package array.erro;

public class Main {
	
	public static int[] instanciaArray(int n) {
		return new int[n];
	} 

	public static void main(String[] args) {
		
		int tam = -10;
		int array[];
		
		try {
			array = instanciaArray(tam);
			for(int i = 0; i < tam; i++) {
				System.out.println(array[i]);
			}
		}
		catch(NegativeArraySizeException erro){
			System.out.println("Ocorreu um erro: " + erro.getMessage());
			System.out.println(erro);
			System.out.println("Digite outro valor.");
		}
	}
}