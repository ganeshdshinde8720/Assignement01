package assignment01;

public class ArithmeticDemo {

	public static void main(String[] args) {
	  
		ArithmeticDemo ad = new ArithmeticDemo();
		
		ad. add ();
		ad. sub ();
		ad. mult ();
		ad. div  ();
		ad. mod ();

	}
     public void add() {
    	 int a = 25;
    	 int b = 50;
    	 int sum = a+b;
    	 System.out.println(sum);
     }
     public void sub()  {
    	 int a=25;
    	 int b=50;
    	 int sub=b-a;
    	 System.out.println(sub);
     }
     public void mult()  {
    	 int a=25;
    	 int b=50;
    	 int mult=a*b;
    	 System.out.println(mult);
     }
     public void div()  {
    	 int a=25;
    	 int b=50;
    	 int div=b/a;
    	 System.out.println(div);
     }
     public void mod()  {
    	 int a=25;
    	 int b=50;
    	 int mod=b%a;
    	 System.out.println(mod);
     }
}
