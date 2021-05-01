package seventhpackage;

public class BubbleSortingExample {

    public static void main(String[] args) {

        // 5, 2, 6, 1, 10, 3, 8, 0

        // bubble sort

        //2, 5, 6, 1, 10, 3, 8
        //2, 5, 6, 1, 10, 3, 8
        //2, 5, 1, 6, 10, 3, 8
        //2, 5, 1, 6, 10, 3, 8
        //2, 5, 1, 6, 3, 10, 8
        //2, 5, 1, 6, 3, 8, 10

        //2, 5, 1, 6, 3, 8, 10
        //2, 1, 5, 6, 3, 8, 10
        //2, 1, 5, 6, 3, 8, 10
        //2, 1, 5, 3, 6, 8, 10
        //2, 1, 5, 3, 6, 8, 10

        //1, 2, 5, 3, 6, 8, 10
        //1, 2, 3, 5, 6, 8, 10
        //1, 2, 3, 5, 6, 8, 10
        //1, 2, 3, 5, 6, 8, 10
        //1, 2, 3, 5, 6, 8, 10

        int[] numbers = {5, 6, 2, 4};

        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temporary = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temporary;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }


    }
}
