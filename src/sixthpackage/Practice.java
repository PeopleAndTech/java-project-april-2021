package sixthpackage;

import java.util.Arrays;
import java.util.HashMap;

public class Practice {

    public static void getIsAnagram(String a, String b) {
        char[] charArrayOfA = a.toCharArray();
        char[] charArrayOfB = b.toCharArray();

        Arrays.sort(charArrayOfA);
        Arrays.sort(charArrayOfB);

        boolean isAnagram = Arrays.equals(charArrayOfA, charArrayOfB);

        if (isAnagram) {
            System.out.println(a + " and " + b + " are anagram");
        } else {
            System.out.println(a + " and " + b + " are not anagram");
        }
    }


    public static HashMap<String, Integer> getTheOccurencesOfWords(String data) {
        String updatedData = data.replace(".", "");
        String[] arrayOfIndividualWord = updatedData.split(" ");

        HashMap<String, Integer> mapIfOccurance = new HashMap<>();

        for (int i = 0; i < arrayOfIndividualWord.length; i++) {
            Integer previousCount = mapIfOccurance.get(arrayOfIndividualWord[i]);
            if (previousCount == null) {
                previousCount = 0;
            }

            mapIfOccurance.put(arrayOfIndividualWord[i], previousCount + 1);
        }

        System.out.println(mapIfOccurance);
        return mapIfOccurance;
    }

    public static void main(String[] args) {
        //1. write the application figure out if given 2 string are anagram or not
        getIsAnagram("CAT", "ACT");

        //2. from a given sentence, find out their occurrences

        String data = "Today is Sunday. Sunday is a good day. I play soccer on Sunday.";
        HashMap<String, Integer> mapOfOccurences = getTheOccurencesOfWords(data);

        //3. from a given sentence, find out the dupes in the map

        //mapOfOccurences

    }
}
