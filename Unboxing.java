package Core_Java;
/*2. Write a java program for  Unboxing.(all types).*/


public class Unboxing {

	public static void main(String[] args) {
		// Unboxing for Byte
		Byte byteObject=10;
		byte byteValue=byteObject;
		System.out.println("Byte Value:"+byteValue);
		// Unboxing for Short
		Short shortObject=20;
		short shortValue=shortObject;
		System.out.println("Short Value:"+shortValue);
		// Unboxing for Integer
		Integer intObject=30;
		int integerValue=intObject;
		System.out.println("Integer Value:"+integerValue);
		// Unboxing for Long
		Long longObject=40L;
		long longValue=longObject;
		System.out.println("Long Value:"+longValue);
		// Unboxing for Float
		Float floatObject=50.5f;
		float floatValue=floatObject;
		System.out.println("Float Value:"+floatValue);
		// Unboxing for Double
		Double doubleObject=60.5;
		double doubleValue=doubleObject;
		System.out.println("Double Value:"+doubleValue);
		// Unboxing for Boolean
		Boolean booleanObject=true;
		boolean booleanValue=booleanObject;
		System.out.println("Boolean Value:"+booleanValue);
		// Unboxing for Character
		Character characterObject='N';
		char characterValue=characterObject;
		System.out.println("Character Value:"+characterValue);
	}

}
/*Output:
Byte Value:10
Short Value:20
Integer Value:30
Long Value:40
Float Value:50.5
Double Value:60.5
Boolean Value:true
Character Value:N
 */
