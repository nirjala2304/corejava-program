/*Write a program to find the perimeter of the square.*/



import java.util.Scanner;
public class SqPerimeter {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);//for user input
                System.out.println("Enter side length of square:");
		int side=sc.nextInt();//taking side value form the user
                int perimeter=4*side;//Calculating the perimeter
		System.out.println("Perimeter of square:" + perimeter);
		
	}

}

/*Output:

Enter side length of square:
4
Perimeter of square:16

*/