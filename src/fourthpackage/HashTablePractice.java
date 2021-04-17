package fourthpackage;

import java.util.Hashtable;

public class HashTablePractice { // TO DO

    // thread safe and synchronized
    // it is slower than hashmap
    //
    public static void main(String[] args) {
        Hashtable<String, String> studentTable = new Hashtable<>();

        studentTable.put("a", "Tanzina");
        studentTable.put("x", "Pria");
        studentTable.put("D", "Menad");

        System.out.println(studentTable);
    }
}
