package fourthpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {

        // unique data --> no duplicate data is allowed
        HashSet<String> cities = new HashSet<>();
        ArrayList<String> cityList = new ArrayList<>();
        cities.add("Rego park");
        cities.add("jamaica");
        cities.add("Medford");
        cities.add("Rego park");

        System.out.println(cities);

        Iterator it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next().toString();
            cityList.add(city);
        }

        System.out.println(cityList);


        System.out.println(cityList.get(0));

    }
}
