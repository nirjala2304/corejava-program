//1.Write a program demonstrating  Exception handling using try catch for Arithmatic Exception.

package oopsfeature;

public class ArthmeticException {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			int ans=30/0;
		}
		//catch:catch block is used to handle exception.
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("Arithmetic exception");
	}

}

/*Output:
  java.lang.ArithmeticException: / by zero
  Arithmetic exception
 */

