package Day_03;

public class Leapyear_Assign1 {
	public static void main(String[] args) {
		int year;
		int count=0;
		
		System.out.println("Here is the list of leap years between 2000 and 2100 : ");
	
		for (year = 2000; year < 2100; year++)
			if (year % 4 == 0)
			{
				System.out.println(+year);
				count++;
			}
		System.out.println("Count of leap years between 2000 and 2100 : "+count);
	}
	
			}
	


