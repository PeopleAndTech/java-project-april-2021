package firstpackage;

public class DataTypes2 {

	public static void main(String[] args) {

		String name = "Shadman";
		System.out.println(name);

		int number1 = 10;
		System.out.println(number1);

		double price1 = 10.99;
		double price2 = 5.99;
		System.out.println(price1 + price2);

		boolean isItGonnaRainToday = false;
		System.out.println(isItGonnaRainToday);

		// byte - 8 bit
		byte number2 = -128;
		byte number3 = 127;

		// short - 16 bit
		short number4 = -32768;
		short number5 = 32767;

		// int - 32 bit
		int number6 = -2_147_483_648;
		int number7 = 2_147_483_647;
		System.out.println(number7);

		// long - 64 bit
		long number88 = 34765948789l;

		// double - 64bit
		double number9 = 1.33d;

		// float - 32bit
		float number10 = 1.33f;

		// char - character - unicode - 16bit
		// https://en.wikipedia.org/wiki/List_of_Unicode_characters
		char latinB = '\u018B';
		System.out.println(latinB);

		char alphabet = 'a';
		System.out.println(alphabet);

	}

}
