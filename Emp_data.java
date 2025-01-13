/*Write a java program to take Employee id,name,address and salary from user and display on to the screen.*/

import java.util.Scanner;
class Emp_data
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);//for user input

		System.out.println("Enter Employee Id: ");
		int id=sc.nextInt();//taking emp id from the user

		System.out.println("Enter Employee Name: ");
		sc.nextLine();
		String name=sc.nextLine();//taking emp name from the user

		System.out.println("Enter Employee Address: ");
		String address=sc.nextLine();//taking emp address from the user

		System.out.println("Enter Salary of Employee: ");
		float salary=sc.nextFloat();//taking emp salary from the user
			
		//displaying employee details
		System.out.println("Employee Details");
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary : "+salary);
		
	}
}

/*Output:
Enter Employee Id:
1
Enter Employee Name:
Nirjala Madgal
Enter Employee Address:
650/1 A new vidi gharkul kumbhari solapur
Enter Salary of Employee:
25000
Employee Details
Employee Id: 1
Name: Nirjala Madgal
Address: 650/1 A new vidi gharkul kumbhari solapur
Salary of Employee: 25000.0
*/
