package Core_Java;
/*Write a java program to sort in ascending order an array of given integers
[45,35,56,67,78,89,78,12,20]*/

import java.util.Arrays;
public class SortIntegers {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	//Declare and initialize an array of integers
    	int[] array= {45,35,56,57,78,39,78,12,20};
    	//Sort the array in ascending order
    	Arrays.sort(array);
    	//print the sorted array
    	System.out.println("Sorting array in ascending order:"+ Arrays.toString(array));
    	}

}
/*Output:
Sorting array in ascending order:[12, 20, 35, 39, 45, 56, 57, 78, 78]
*/
