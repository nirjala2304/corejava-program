package Core_Java;
/*1.Create abstract class vaccine.Create two variables age(int),
nationality(String).create 2 concrete methods firstDose() 
and secondDose(). Scenario 1:user can take the first dose if
the user is Indian and age is 18.After vaccination the user has
to pay 250rs(which will be displayed on the console). Scenario 
2: Users are eligible to take the second dose only after completing 
the first dose. Scenario 3: create abstract method boosterDose() in 
abstract class Vaccine.Create one implementation class vaccinationSuccessful, 
where implement boosterDose() method. Create main class vaccination and 
invoke all methods accordingly. [Hint:Create constructor to initialize 
variables age and nationality,Use flow control(Ifelse) to check condition]*/

//Abstract class Vaccine
abstract class Vaccine{
	int age;
	String nationality;
	// Constructor to initialize
	Vaccine(int age,String nationality){
		this.age=age;
		this.nationality=nationality;
		}
	//Concrete method firstdose()
	public void firstDose() {
		if(age>=18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("First dose administered Successfully");
			System.out.println("Please pay Rs.250.");
			}else {
				System.out.println("You are not eligible for the first dose.");
			}
	}
	//Concrete method firstdose()
	public void secondDose() {
		if(age>=18 && nationality.equalsIgnoreCase("Indian")) {
			System.out.println("Second dose administered Successfully");
			}else {
				System.out.println("You are not eligible for the second dose.");
			}
	}
	// Abstract method boosterDose()
	public abstract void boosterDose();
}
// implementation class
class VaccinationSuccessful extends Vaccine{

	VaccinationSuccessful(int age, String nationality) {
		super(age, nationality);
		// TODO Auto-generated constructor stub
	}
	// Implementation of abstract method boosterDose()
	@Override
	public void boosterDose() {
		System.out.println("Booster dose administered successfully.");
	}
	
}
// Main class vaccination
public class AbstractExample {

	public static void main(String[] args) {
		VaccinationSuccessful vac=new VaccinationSuccessful(25,"Indian");
		vac.firstDose();
		vac.secondDose();
		vac.boosterDose();
	}

}

/*Output:
First dose administered Successfully
Please pay Rs.250.
Second dose administered Successfully
Booster dose administered successfully.*/
