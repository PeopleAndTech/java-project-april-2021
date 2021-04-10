package secondpackage;

public class ObjectCreationExecution {

	public static void main(String[] args) {

		// classThatYouWantToCreateObjectOf ObjectName/ReferrenceVariable = new
		// nameOfTheConstructor();

		// Laptop objectOfLaptop = new Laptop();

		Laptop laptop = new Laptop();
		// laptop.printModelOfLaptop();

		// int year = laptop.getYearOfLaptop();
		// System.out.println(year);

		// .printDetailsOfLaptop();

		Laptop laptop2 = new Laptop(2025);
		// laptop2.printDetailsOfLaptop();

		Laptop laptop3 = new Laptop(2025, "Asus");
		laptop3.printDetailsOfLaptop();

		// what gets executed first ? method or a constructor

	}

}
