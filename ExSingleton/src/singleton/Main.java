package singleton;

public class Main {

	public static void main(String[] args) {
		
		Singleton s1 = Singleton.GetInstance();
		Singleton s2 = Singleton.GetInstance();
		
		s1.numero += 10;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
		
		s2.numero += 40;
		System.out.println(s1.numero);
		System.out.println(s2.numero);
	}
}