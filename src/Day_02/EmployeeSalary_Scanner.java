package Day_02;

import java.util.Scanner;

public class EmployeeSalary_Scanner {

	public static void main(String[] args) {
		Scanner employee = new Scanner(System.in);	
		
		System.out.println("Enter the Basic Salary of the employee: ");
		double basic = employee.nextDouble();
		
		System.out.println("Enter the Basket of Allowance of the employee: ");
		double BOA = employee.nextDouble();
		
		System.out.println("Enter the Bonus of the employee: ");
		double Bonus = employee.nextDouble();
		
		double Grosssalary = basic+BOA+Bonus;
		System.out.println("Gross Salary of the employee: "+Grosssalary);
		double PF = 0.15 * basic;
		System.out.println("PF of the employee: "+PF);
		double netsalary = Grosssalary - PF;	
		System.out.println("Net Salary of the employee: "+netsalary);
		double tax = 0.05 * netsalary;
		System.out.println("Tax deducted : "+tax);
		double Finalsalary = netsalary - tax;
		
		System.out.println("Salary of the employee: "+Finalsalary);
		
	}
}
