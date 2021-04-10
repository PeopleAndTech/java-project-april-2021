package secondpackage;

public class Mobile {

	// global variables
	String mobileOS;

	public Mobile(String osFromConstructor) {
		this.mobileOS = osFromConstructor;
		System.out.println("Mobile Constructor is being executed");
	}

	public void printMakeOfMobile(int yearOfMobile) {

		System.out.println(mobileOS);
		System.out.println(yearOfMobile + " from printMakeOfMobile method -2");
		System.out.println(yearOfMobile + " from printMakeOfMobile method -2 ");
		System.out.println(yearOfMobile + " from printMakeOfMobile method -2");
	}

	public void printMakeOfMobile(String makeOfMobile) {
		System.out.println(mobileOS);

		System.out.println(makeOfMobile + " from printMakeOfMobile method - 1");
	}

	public void printMakeOfMobile(String makeOfMobile, int yearOfMobile) {
		System.out.println(makeOfMobile + yearOfMobile + " from printMakeOfMobile method - 3");
	}

}
