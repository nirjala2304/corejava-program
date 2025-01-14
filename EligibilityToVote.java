/*Write java program to check  candidate eligible for voting or not.give me a simple java code*/


import java.util.Scanner;
public class EligibilityToVote{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
      System.out.println("Enter the age:");// user to enter their age
      int age=sc.nextInt();
       if(age>=18){//Use a descriptive variable name and a clear condition
           System.out.println("You are eligible to vote!.");//Print the result with a clear message
       }else{
           System.out.println("You are not eligible to vote!.");//Print the result with a clear message
}
}
}

/*Output:
Enter the age:
12
You are not eligible to vote!.
Enter the age:
18
You are eligible to vote!.
*/