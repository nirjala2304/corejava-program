//2.Write a program demonstrating multiple catch statements and finally block.

package oopsfeature;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		//try: is keyword used to specify block where placed an exception code.		
		try {
			int arr[]=new int[10];
			arr[20]=111;
		}
		//catch:catch block is used to handle exception.
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");

		}
		catch(Exception e)
		{
			System.out.println("Global Exception");

		}
		finally
		{
			System.out.println("Finally block");
		}

	}

}

/*Output:
  ArrayIndexOutOfBoundsException
  Finally block
 */
