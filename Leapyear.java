/*Write a program to check leap year using if else. How to check whether a given year is a leap year or not.*/



import java.util.Scanner;
public class Leapyear{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a year:");the user to enter a year
   int year=sc.nextInt();
   if(year % 4 == 0){// Use a descriptive variable name and a clear condition
      System.out.println(year +"is a leap year.");// Print the result
  }else{
      System.out.println(year +"is a not leap year.");// Print the result
}
}
}


/*Output:
Enter a year:
2004
2004is a leap year. 
Enter a year:
2023
2023is a not leap year.
*/
      