package fourthpackage;

import java.util.ArrayList;

public class ArrayListPractice {

    //https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
    public static void main(String[] args) {

        ArrayList<String> countryList = new ArrayList<>();
        countryList.add("USA");
        countryList.add("Canada");
        countryList.add("China");


        System.out.println(countryList);
        System.out.println(countryList.size());


        for (int i = 0; i < countryList.size(); i++) {
            String country = countryList.get(i);
            System.out.println(country);
        }

        System.out.println("***********");

        countryList.remove("USA");
        System.out.println(countryList);
        System.out.println(countryList.size());

        System.out.println("***********");
        System.out.println(countryList.isEmpty());
        countryList.clear();
        System.out.println(countryList.size());
        System.out.println(countryList.isEmpty());

    }

    // ask user to insert 5 of his fav food
    // store them into listOfFoods
    // ask user to insert 5 of his fav color
    // store them into listOfColors
    // return all of his fav


}
