package Core_Java;
/*Write a program to check given number is prime number or not*/

import java.util.Scanner;
//Class name should start with a capital letter 
public class Prime_or_Not {
	// Method name should start with a lowercase letter
    public static void main(String[] args) {
    	//for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
      //taking number from the user
        int number = sc.nextInt();
      
     if (isPrime(number)) {
            System.out.println(number + " is a prime number.");//Print the result
        } else {
            System.out.println(number + " is not a prime number.");//Print the result
        }
    }

    // Method to check if a number is prime using a loop
    static boolean isPrime(int number) {
        if (number <= 1) 
        	return false; // Numbers less than or equal to 1 are not prime

        for (int i = 2; i <= number / 2; i++) { // Loop from 2 to num / 2
            if (number % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // No factors found, it's prime
    }
}

/*Output:
Enter a number: 5
5 is a prime number.
Enter a number: 10
10 is not a prime number.
 */

