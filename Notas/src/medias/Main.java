package medias;

public class Main {

	public static void main(String[] args) {
		
		Media aluno = new Media();
		
		aluno.nota1 = 8f;
		aluno.nota2 = 6f;
		aluno.nota3 = 7f;
		
		float resultado = aluno.aritmetica();
		System.out.println("Media aritmetica: " + resultado);
		
		resultado = aluno.ponderada();
		System.out.println("Media ponderada: " + resultado);
	}
}