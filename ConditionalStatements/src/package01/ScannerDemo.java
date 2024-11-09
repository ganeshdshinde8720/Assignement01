package package01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any float value");
		float f = sc.nextFloat();
		System.out.println(f);
		
		System.out.println("Enter any String value");
		String str = sc.next();
		System.out.println(str);

	}

}
