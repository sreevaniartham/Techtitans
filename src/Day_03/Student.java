package Day_03;

public class Student {
	float Math;
	float Science;
	float English;
	float Hindi;
	
	public Student(float m1, float m2, float m3, float m4) {
		Math = m1;
		Science = m2;
		English = m3;
		Hindi = m4;		
	}
	public Student(float m1, float m2, float m3) {
		Math = m1;
		Science = m2;
		English = m3;
		Hindi = 35;		
	}
	public Student(float m1, float m2) {
		Math = m1;
		Science = m2;
		English = 35;
		Hindi = 35;		
	}
	public Student(float m1) {
		Math = m1;
		Science = 35;
		English = 35;
		Hindi = 35;		
	}
	void calculatesum() {		
		float sum = Math+Science+English+Hindi;
		System.out.println("Sum of the marks scored by the student is : "+sum);
	}
	
	void calculateavg() {
		float avg = (Math+Science+English+Hindi)/4;
		System.out.println("Avg of the marks scored by the student is :"+avg);
		
	}
	public static void main(String[] args) {
		Student s1 = new Student(78.44f, 56.66f, 89.22f, 78.99f);
		
		s1.calculatesum();
		s1.calculateavg();
		
		Student s2 = new Student(98.9f, 99.66f, 97.6f);
		s2.calculatesum();
		s2.calculateavg();
				
		Student s3 = new Student(98.9f, 99.66f);
		s3.calculatesum();
		s3.calculateavg();
		
		Student s4 = new Student(98.9f);
		s4.calculatesum();
		s4.calculateavg();
	}
}
