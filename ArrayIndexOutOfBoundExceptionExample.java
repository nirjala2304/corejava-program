//3.Write a program using exception handling to handle array index out of bounds.
package oopsfeature;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			int arr[]=new int[10];
			arr[20]=111;
		}
		//catch:catch block is used to handle exception.
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hiii");
	}

}

/*Output:
  java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 10
  hiii
 */
