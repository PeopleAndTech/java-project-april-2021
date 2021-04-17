package fourthpackage;

import java.util.Random;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arrayNumbers = new int[5];

        for (int i = 0; i < arrayNumbers.length; i++) {
            int randomNumber = random.nextInt(1000);
            arrayNumbers[i] = randomNumber;
        }


        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println(arrayNumbers[i]);
        }

    }
}
