package package01;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		
		int a=25;
		int b=50;
		
		System.out.println(a++ + ++b); // 76
		System.out.println(a-- + --b); // 76
		System.out.println(--a + ++b); // 75
		System.out.println(b-- - --a); // 28
		System.out.println(a);         // 23
		System.out.println(b);         // 50
		

	}

}
