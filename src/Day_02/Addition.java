package Day_02;

public class Addition {
	
	int input1;
	int input2;
	
	//with inputs,without output
	//with inputs,with output
	//without inputs,with output
	//without inputs,without output
	
	void addnumber1(int a, int b) {
		
		int sum = a+b;
		System.out.println("sum of "+a+" and "+b+" in Method1 is "+sum);			
	}
     int addnumber2(int a, int b) {
		
		int sum = a+b;
		return sum;
	}
     int addnumber3() {
 		
 		int sum = input1+input2;
 		return sum;
 	}
     void addnumber4() {
 		
    	 int sum = input1+input2;
 		System.out.println("sum of "+input1+" and "+input2+" in Method4 is "+sum);			
 	}
     public static void main(String[] args) {
		
    	 Addition obj = new Addition();
    	 
    	 obj.addnumber1(10,20);
    	 
    	int output2 = obj.addnumber2(30,40);
    	System.out.println("Sum is :"+output2);
    	
    	obj.input1=output2;
        obj.input2=50;
    	int output3= obj.addnumber3();
    	System.out.println("sum of"+output2+" and 50 is :"+output3);
    	
     	obj.input1= output3;
    	obj.input2= output2;
    	obj.addnumber4();
    	
    	 
    	 
	}
}
