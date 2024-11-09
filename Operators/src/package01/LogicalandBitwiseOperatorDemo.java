package package01;

public class LogicalandBitwiseOperatorDemo {

	public static void main(String[] args) {
		int a=50;
		int b=25;
		int c=60;
		
		// Logical Operator
		System.out.println(a<b && a<c); // false
		System.out.println(a>b && a<c); // true
		
		// Bitwise Operator
		System.out.println(a>b & a<c); // true
		System.out.println(a>b & a>c); // false

	}

}
