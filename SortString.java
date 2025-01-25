package Core_Java;
/*Write a java program to sort in descending order an array of given string
 [A X D Z Y C W B]*/

import java.util.Arrays;
public class SortString {
    public static void main(String[] args) {
    //Declare and initialize an array of String
	  String[] array= {"A","X","D","Z","Y","C","W"};
	//Sort the array in ascending order
	  Arrays.sort(array);
	//print the sorted array
	  System.out.println("Sorted array in ascending order:"+ Arrays.toString(array));
	  //Reverse the array to get descending order
	  String[] reversedArray=new String[array.length];
	  for(int i=0;i<array.length;i++) {
		  reversedArray[i]=array[array.length-1-i];
	  }
	  //print the reversed array
	  System.out.println("Sorted array in descending order:" + Arrays.toString(reversedArray));
	  
	}
}
/*Output:
Sorted array in ascending order:[A, C, D, W, X, Y, Z]
Sorted array in descending order:[Z, Y, X, W, D, C, A]
*/
