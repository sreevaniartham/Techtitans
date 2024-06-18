package Day_03;

public class Leapyear {	
	
   public static void main(String[] args) {
	  int year;
	  int leapyearcount = 0;
	  int evenyearcount = 0;
	  int oddyearcount = 0;
	  
	  System.out.println("Leap years between 2000 and 2100 are : ");
	
	  for (year = 2001; year < 2100; year++) {
		// Test for leap year
		if (year % 4 == 0) {
		  // Ten results per line separated by exactly one space
		  //System.out.println((++count % 10 == 0)? year + "\n": year + " ");
        //  System.out.println("Leap year "+year);
         // leapyearcount++;
                
	    }
		if(year % 2 == 0) {
			System.out.println("even year :" +year);
			evenyearcount++;
		}
		else 
		{
			System.out.println("odd number : "+year);
			oddyearcount++;
		}
     }
	//System.out.println();
	//System.out.println("The number of leap years are " + count);
	//  System.out.println("number of Leap years: "+leapyearcount);
	  System.out.println("Number of Even years : "+evenyearcount);
	  System.out.println("Number of Odd years: "+oddyearcount);
  }
}

