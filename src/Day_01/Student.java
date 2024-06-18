package Day_01;

public class Student {
	
	int Math;
	int Science;
	int English;
	int Hindi;	
	static int Total;
	static int Average;
	
	void  TotalMarks () {
		
		Total=Math+Science+English+Hindi;
		//System.out.println("Total Marks are : "+Total);	
	
	}	
    void AverageMarks () {
    	
    	//Total=Math+Science+English+Hindi;
    	Average = Total/4;
	   // System.out.println("Average Marks are : "+Average);	    	
    }
    public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.Math = 80;
		obj1.Science = 75;
		obj1.English = 60;
		obj1.Hindi = 90;
		
		Student obj2 = new Student();
		obj2.Math = 67;
		obj2.Science = 86;
		obj2.English = 76;
		obj2.Hindi = 54;
		
		Student obj3 = new Student();
		obj3.Math =56;
		obj3.Science = 78;
		obj3.English = 98;
		obj3.Hindi = 76;
		
		Student obj4 = new Student();
		obj4.Math = 56;
		obj4.Science = 89;
		obj4.English = 79;
		obj4.Hindi = 54;		
		
		obj1.TotalMarks();
		obj1.AverageMarks();
		System.out.println("Total Marks of Student1 : "+Total);	
		System.out.println("Average Marks of Student1 are : "+Average);	
		
		obj2.TotalMarks();
		obj2.AverageMarks();
		System.out.println("Total Marks of Student2 : "+Total);	
		System.out.println("Average Marks of Student2 are : "+Average);	
	
		obj3.TotalMarks();
		obj3.AverageMarks();
		System.out.println("Total Marks of Student2 : "+Total);	
		System.out.println("Average Marks of Student2 are : "+Average);	
				
		obj4.TotalMarks();
		obj4.AverageMarks();
		System.out.println("Total Marks of Student2 : "+Total);	
		System.out.println("Average Marks of Student2 are : "+Average);	
	
		
	}
    
}

