package Day_01;

import java.util.Scanner;

public class Student_Scanner {

	public static void main(String[] args) {
				
		Scanner Student = new Scanner(System.in);
		
		System.out.println("Name of the Student : ");
    	String Name = Student.next();
		
		System.out.println("Marks in Math : ");
		float Math = Student.nextFloat();
		System.out.println("Marks in Science : ");
		float Science = Student.nextFloat();
		System.out.println("Marks in English : ");
		float English = Student.nextFloat();
		System.out.println("Marks in Hindi : ");
		float Hindi = Student.nextFloat();
		
		float Total = Math + Science + English + Hindi;
        System.out.println("Total is : "+Total);	
        float Average = Total/4;
        System.out.println("Average is : "+Average);	
				
	}
}