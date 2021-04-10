package secondpackage;

public class Laptop {

	// accessSpecifier sameNameOfTheClss(){--constructor starts

	// constructor body

	// } --> constructor ends

	// defaultConsturctor
	public Laptop() {

	}

	// parameterized Consturctor
	public Laptop(int yearFromConstructor) {
		System.out.println("our new constructor is being executed");
		this.year = yearFromConstructor;
	}

	public Laptop(String modelFromConstructor) {
		this.model = modelFromConstructor;
	}

	public Laptop(int yearFromConstructor, String modelFromConstructor) {
		this.year = yearFromConstructor;
		this.model = modelFromConstructor;
	}

	// global variable / class level variabLe
	int year;
	String model;
	String modelFromConstructor;

	public void printModelOfLaptop() {
		// local variables / method level variabLe--> they belongs to this method only
		System.out.println(model);
	}

	public int getYearOfLaptop() {
		return year;
	}

	public void printDetailsOfLaptop() {
		System.out.println("laptops year is " + year);
		System.out.println("laptops model is " + model);

	}

}
