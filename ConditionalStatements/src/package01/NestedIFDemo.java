package package01;

public class NestedIFDemo {

	public static void main(String[] args) {
		int a=450;
		int b=400;
		
		// outer if block
		if (a>440) {
			System.out.println("A is Greater");
			// inner if block
			if (b>450) {
				System.out.println("B is Greater");
			}
			// inner else block
			else {
				System.out.println("B is Lesser");
			}
		}
		else {
			System.out.println("A is Lesser");
		}

	}

}
