package thirdpackage;

import java.util.Scanner;

public class ScannerPractice {


    public static void main(String[] args) {

        // math();
        ageCalculator();

    }

    public static void ageCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please insert your name :");
        String name = scanner.next();

        System.out.println("enter your age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println(name + " you are welcome ");
        }

    }

    public static void math() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert your name :");
        String name = scanner.next();

        System.out.println("please insert number 1 : ");
        int number1 = scanner.nextInt();

        System.out.println("please insert number 2 : ");
        int number2 = scanner.nextInt();


        System.out.println("if you want to + insert 1");
        System.out.println("if you want to - insert 2");

        int condition = scanner.nextInt();
        int total = 1;
        if (condition == 1) {
            total = number1 + number2;
        } else if (condition == 2) {
            total = number1 - number2;
        }


        System.out.println(name + "'s result is " + total);
    }


}
