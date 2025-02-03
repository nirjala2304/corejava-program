package Core_Java;
/*1. Write  a java program for Autoboxing.(All Primitive Types)*/
public class Autoboxing {

	public static void main(String[] args) {
		// Autoboxing for byte
		byte byteValue=10;
		Byte byteObject=byteValue;//Autoboxing
		System.out.println("Byte Object:"+byteObject);
		// Autoboxing for short
		short shortValue=20;
		Short shortObject=shortValue;//Autoboxing
		System.out.println("Short Object:"+shortObject);
		// Autoboxing for int
		int intValue=30;
		Integer integerObject=intValue;//Autoboxing
		System.out.println("Integer Object:"+integerObject);
		// Autoboxing for long
		long longValue=40;
		Long longObject=longValue;//Autoboxing
		System.out.println("Long Object:"+longObject);
		// Autoboxing for float
		float floatValue=50;
		Float floatObject=floatValue;//Autoboxing
		System.out.println("Float Object:"+floatObject);
		// Autoboxing for double
		double doubleValue=60;
		Double doubleObject=doubleValue;//Autoboxing
		System.out.println("Double Object:"+doubleObject);
		// Autoboxing for boolean
		boolean booleanValue=true;
		Boolean booleanObject=booleanValue;//Autoboxing
		System.out.println("Boolean Object:"+booleanObject);
		// Autoboxing for char
		char charValue='N';
		Character characterObject=charValue;//Autoboxing
		System.out.println("Character Object:"+characterObject);
		
	} 

}
/*Output:
 Byte Object:10
Short Object:20
Integer Object:30
Long Object:40
Float Object:50.0
Double Object:60.0
Boolean Object:true
Character Object:N
 */
