package Day_02;

public class PrintNumber {
	int a = 10;
	int b = 20;
	
	void printnumber1() {
		
		System.out.println("Value of A in method 1 is "+a);
		System.out.println("Value of B in method 1 is "+b);
	}
    void printnumber2() {
    	int a = 100;
    	int b = 200;
    	System.out.println("Value of A in method 2 is "+a);
		System.out.println("Value of B in method 2 is "+b);
		System.out.println("Value of A in method 2 is "+this.a);
		System.out.println("Value of B in method 2 is "+this.b);
	}
    	public static void main(String[] args) {
    		PrintNumber obj = new PrintNumber();
    		obj.printnumber1();
    		obj.printnumber2();
    		
		
    }
}
