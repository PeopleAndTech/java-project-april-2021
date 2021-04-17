package fourthpackage;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice2 {

    public static void main(String[] args) {

        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(101);
        numberList.add(102);


        ArrayList<Object> objectsList = new ArrayList<>();
        objectsList.add("name");
        objectsList.add(true);
        objectsList.add(100);


        // for loop --> size of the arraylist
        for (int i = 0; i < numberList.size(); i++) {
            int number = numberList.get(i);
            System.out.println(number);
        }

        System.out.println("********");

        //itereator
        Iterator iterator = numberList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
