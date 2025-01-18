package Core_Java;
/*Write a java program to check given number is perfect number or not*/

import java.util.Scanner;
//Class name should start with a capital letter 
public class PerfectNumber {
	// Method name should start with a lowercase letter
	public static void main(String args[]) {
		//for user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		//taking num value from the user
		int num=sc.nextInt();
		// Variable Name
		int sum=0;
		// Use a descriptive variable name and a clear condition
		for(int i=1;i<num;i++) {
			if(num % i == 0) {
				sum+=i;
			}
		}
		
		if(sum==num) {
			System.out.println(num +" is a perfect number.");//Print the result
		}else {
			System.out.println(num +" is a not perfect number.");//Print the result
		}
	}

}
/*Output:
Enter a number:
5
5 is a not perfect number.
Enter a number:
28
28 is a perfect number.
*/

