package Day_02;

public class Operators {

	int a = 9;
	int b = 10;
	
	public void uneryOperator() {
		
		++a;
		System.out.println("After pre incrementation " +a);
		a++;
		System.out.println("After post incrementation " +a);
		--a;
		System.out.println("After pre decrementation " +a);
		a--;
		System.out.println("After post decrementation " +a);
	}
	
	public static void main(String[] args) {
		
		Operators opsExample = new Operators();

		opsExample.uneryOperator();
	}
}
