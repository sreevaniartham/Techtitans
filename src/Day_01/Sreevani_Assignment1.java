package Day_01;

public class Sreevani_Assignment1 {
	float Math;
	float Science;
	float English;
	float Hindi;	
	float Total;
	float Average;
	String studentName;
	
	
	void  TotalMarks () {
		
		Total=Math+Science+English+Hindi;
		System.out.println("Name of the Student : "+studentName);	
		System.out.println("Total Marks are : "+Total);	
	
	}	
    void AverageMarks () {
    	

    	Average = Total/4;
	    System.out.println("Average Marks are : "+Average);	    	
    }
    public static void main(String[] args) {
    	Sreevani_Assignment1 obj1 = new Sreevani_Assignment1();
    	obj1.studentName= "Student1";
		obj1.Math = 80;
		obj1.Science = 75;
		obj1.English = 60;
		obj1.Hindi = 90;
		
		Sreevani_Assignment1 obj2 = new Sreevani_Assignment1();
		obj2.studentName= "Student2";
		obj2.Math = 67;
		obj2.Science = 86;
		obj2.English = 76;
		obj2.Hindi = 54;
		
		Sreevani_Assignment1 obj3 = new Sreevani_Assignment1();
		obj3.studentName= "Student3";
		obj3.Math =56;
		obj3.Science = 78;
		obj3.English = 98;
		obj3.Hindi = 76;
		
		Sreevani_Assignment1 obj4 = new Sreevani_Assignment1();
		obj4.studentName= "Student4";
		obj4.Math = 56;
		obj4.Science = 89;
		obj4.English = 79;
		obj4.Hindi = 54;		
		
		obj1.TotalMarks();
		obj1.AverageMarks();
		obj2.TotalMarks();
		obj2.AverageMarks();
		obj3.TotalMarks();
		obj3.AverageMarks();
		obj4.TotalMarks();
		obj4.AverageMarks();
		
		
	}
    
}
