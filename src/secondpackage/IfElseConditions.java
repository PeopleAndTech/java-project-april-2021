package secondpackage;

public class IfElseConditions {

	public static void main(String[] args) {

		int year = 2025;

		System.out.println(year);

		// if
		// year is 2021
		// print we will get covid vaccination
		// if not
		// we will be quarentined

		// if(condition){-- if blocks body starts
		// some action
		// }--if blocks body ends else--keyword { -- else blocks body starts
		// some action
		// }-- else blocks body ends

		// if(year==2021) {
		// System.out.println("i will get covid vaccination");
		// }else {
		// System.out.println("we will be quarentined ");
		// }

		// if
		// year is more than 2021 or 2021
		// print we will get covid vaccination
		// if not
		// we will be quarentined

		if (year >= 2021) {
			System.out.println("i will get covid vaccination");
		} else {
			System.out.println("we will be quarentined ");
		}

		// if year is 2021 or 2020, be quarentined
		// else enjoy !

		if (year == 2021 || year == 2020) {
			System.out.println("be quarentined");
		} else {
			System.out.println("enjoy ");
		}

		// if year is not 2020 --> enjoy

		// you can also use only if block without else
		if (year != 2025) {
			System.out.println("enjoy from second if block");
		}

		int number = 3;

		if (number == 10 && number > 5) {
			System.out.println("print me ");
		}

		if (number == 10) {

			if (number > 14) {
				System.out.println("num is greater than 14");
			} else {
				System.out.println("num is good");
			}
		}

		// homework

		// print "i love java"
		// if year is 2020 and year is greater than 2019 or 2018

		// || -- or sign
		// && -- and
		// != not equals
		// == equals
		// >=
		// <=

		// if number is greater than 10 print x
		// if number is greater than 6 print y
		// if number is greater than 4 print z

		if (number > 10 || number > 4) {
			System.out.println("num is greater than 10");
		} else if (number >= 3 && number > 2) {
			System.out.println("num is greater than 8");
		} else if (number > 6) {
			System.out.println("num is greater than 6");
		} else {
			System.out.println("do nothing");
		}

	}

}
