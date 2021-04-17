package fourthpackage;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapPractice2 {

    public static void main(String[] args) {


        // USA --> NY, NJ, DC
        // CANADA --> CO, NH

        ArrayList<String> listOfStateUSA = new ArrayList<>();
        listOfStateUSA.add("NY");
        listOfStateUSA.add("NJ");
        listOfStateUSA.add("PA");


        ArrayList<String> listOfStateCanada = new ArrayList<>();
        listOfStateCanada.add("CO");
        listOfStateCanada.add("NH");


        HashMap<String, ArrayList<String>> countryMap = new HashMap<>();
        countryMap.put("USA", listOfStateUSA);
        countryMap.put("Canada", listOfStateCanada);


        System.out.println(countryMap);

        System.out.println(countryMap.get("USA"));


        System.out.println("*********");


        HashMap<String, Integer> cityAndZipOfUSA = new HashMap<>();
        cityAndZipOfUSA.put("Rego Park", 11374);
        cityAndZipOfUSA.put("Forest Hills", 35356);


        HashMap<String, Integer> cityAndZipOfCanada = new HashMap<>();
        cityAndZipOfCanada.put("gvhjbkn", 456);
        cityAndZipOfCanada.put("Forest gvhb", 54);


        ArrayList<HashMap<String, Integer>> cityAndZipCodes = new ArrayList<>();
        cityAndZipCodes.add(cityAndZipOfUSA);
        cityAndZipCodes.add(cityAndZipOfCanada);


        System.out.println(cityAndZipCodes);


        // read both the config files
        // store the key value from the config to maps
        // store the data from the map to a arraylist of map


        HashMap<Integer, ArrayList<String>> workersMap = new HashMap<>();


    }
}
