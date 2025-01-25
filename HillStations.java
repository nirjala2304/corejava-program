package Core_Java;
/*2.Create one superclass HillStations and three subclasses 
Manali, Mussoorie, Gulmarg. Subclasses extend the superclass 
and override its location() and famousFor() method. i.call 
the location() and famousFor() method by the Parent class’,
i.e. Hillstations class. As it refers to the base class 
object and the base class method overrides the superclass
method; the base class method is invoked at runtime. 
ii.call the location() and famousFor() method by the all
subclass’,and print accordingly.*/

//Superclass HillStations
class HillStations1{
	void location() {
		System.out.println("Location:Himalayas");
	}
	void famousFor() {
		System.out.println("Famous for:Natural Beauty");
	}
}
//Subclass Manali
class Manali extends HillStations1{
	@Override
	void location() {
		System.out.println("Location:Himachal pradesh");
	}
	@Override
	void famousFor() {
		System.out.println("Famous for:Skiing");
	}
}
//Subclass Mussoorie
class Mussoorie extends HillStations1{
	@Override
	void location() {
		System.out.println("Location:Uttarakhand");
	}
	@Override
	void famousFor() {
		System.out.println("Famous for:Scenic Views and waterfalls");
	}
}
//Subclass Gulmarg
class Gulmarg extends HillStations1{
	@Override
	void location() {
		System.out.println("Location:Jammu and Kashmir");
	}
	@Override
	void famousFor() {
		System.out.println("Famous for:Skiing and Golfing");
	}
}
public class HillStations {

	public static void main(String[] args) {
		//call method using subclass references
		HillStations1 hs=new HillStations1 ();
		hs.location();
		hs.famousFor();
		System.out.println();
		//call method using subclass references
		Manali manali=new Manali();
		manali.location();
		manali.famousFor();
		System.out.println();
		Mussoorie ms=new Mussoorie();
		ms.location();
		ms.famousFor();
		System.out.println();
		Gulmarg gl=new Gulmarg();
		gl.location();
		gl.famousFor();

	}

}
/*Output:
 Location:Himalayas
Famous for:Natural Beauty

Location:Himachal pradesh
Famous for:Skiing

Location:Uttarakhand
Famous for:Scenic Views and waterfalls

Location:Jammu and Kashmir
Famous for:Skiing and Golfing */
