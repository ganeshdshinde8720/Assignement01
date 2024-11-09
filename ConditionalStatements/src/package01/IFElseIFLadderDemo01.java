package package01;

import java.util.Scanner;

public class IFElseIFLadderDemo01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for A");
		int a = sc.nextInt();
		System.out.println("Enter value for B");
		int b = sc.nextInt();
		
		if (a>b) {
			System.out.println("A is Greater");
		}
		else if (a==b) {
			System.out.println("A is equal to B");
		}
		else {
			System.out.println("A is Lesser");
		}

	}

}
