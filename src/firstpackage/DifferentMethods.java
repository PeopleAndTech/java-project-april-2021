package firstpackage;

public class DifferentMethods {

	// access specifiers :
	// public (classes,variables,methods, main method is always public)
	// private (classes,variables,methods --> cant access outside of the class)
	// protected (classes,variables,methods --> cant access outside of the package)
	// default (classes,variables,methods --> cant access outside of the package)

	static String tv = "LG";

	public static String model = "XXXXXX";

	// IF you don't specify the word static, it becomes non static

	// main method is always static
	// static method/ variable --> can go anywhere (static/non static method)
	// non static method / variables can not go into static method (CAN only go into
	// non static)

	public static void main(String[] args) {
		// accessSpecifer keyword typeOfMethod nameOfThemethod(methodParameter)
		bedRoom();
		livingRoom();

		System.out.println();
	}

	public static void livingRoom() {
		System.out.println(tv + " from livingRoom");
	}

	public static void bedRoom() {
		System.out.println(tv + " from bedRoom");
		System.out.println(model + " from bedRoom");
	}

	// we can't have 2 methods with same name

}
