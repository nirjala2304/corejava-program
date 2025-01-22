package Core_Java;
/*Create a parent class called "Person" with attributes such as name, age, and 
a method called "speak". Create a child class called "Student" that inherits from
Person and has an additional attribute called "grade" and a method called "study". 
Create an object of the Student class and call both the "speak" and "study" methods.*/

class Person{  //This is a parent class
    String name;
	int age;
	void speak() {
		System.out.println("This is speak method");
	}
	
}
//This is a child class is accessing properties of parent class
class Student extends Person{
	char grade;
	void study() {
		System.out.println("This is study method");
	}
}

public class Inheritance_Example {

	public static void main(String[] args) {
		//Creating object of child class
		Student stu=new Student();
		stu.speak();
		stu.study();

	}

}

/*Output:
This is speak method
This is study method */
