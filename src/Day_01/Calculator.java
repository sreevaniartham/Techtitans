
package Day_01;

public class Calculator {
	
	
	float input1;
	float input2;
	
	float output;
	
	//addition
	//subtraction
	//multiplication
	//division
	
	//<return Type> <Name of the method>(<inputs>)
	//{  //your code/logic }

	void addition () {
		output=input1+input2;
		System.out.println("Additon output is : "+output);
	}

	void subtraction () {
		output=input1-input2;
		System.out.println("subtraction output is : "+output);
	}

	void multiplication () {
		output=input1*input2;
		System.out.println("multiplication output is : "+output);
	}

	void division () {
		output=input1/input2;
		System.out.println("division output is : "+output);
	}
	
	public static void main(String[] args) {
		
		//object creation
		//<ClassName> <objName> = new <ClassName>();
		Calculator obj1 = new Calculator();
		obj1.input1=100; //10.0f
		obj1.input2=0;
		
		obj1.addition();
		obj1.subtraction();
		obj1.multiplication();
		obj1.division();
		
		Calculator obj2 = new Calculator();
		obj2.input1=30; //10.0f
		obj2.input2=25;
		
		obj2.addition();
		obj2.subtraction();
		obj2.multiplication();
		obj2.division();
	}
}
