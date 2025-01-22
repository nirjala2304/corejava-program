package Core_Java;
//Write a Java Program  to pass  this keyword as argument in the constructor call.

public class ThisKeyword {//Class name should start with a capital letter 
    String city;
    String address;

    ThisKeyword(String city, String address) {//this is parameterized constructor
    	//this keyword assign the current value to instance variable
    	this.city = city;
        this.address = address;
    }

    void show() {//used to display the data
        System.out.println("City: " + city + ", Address: " + address);
    }
    public static void main(String[] args) {
    	//creating object of a class
    	//passing values to the parameterized constructor
        ThisKeyword obj = new ThisKeyword("Solapur", "New Vidi Gharkhul");
        obj.show();//call the show method 

    }
}

/*Output:
City: Solapur, Address: New Vidi Gharkhul
*/
