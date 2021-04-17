package fourthpackage;

import java.util.HashMap;

public class HashMapPractice {

    public static void main(String[] args) {

        //dbName=com.oracle
        //dbUser=testuser
        //dbPassword=670h&59780


        // not thread safe and non synchronized 1

        HashMap<String, String> informationMap = new HashMap<>();
        informationMap.put("dbName", "com.sql");
        informationMap.put("dbUser", "testUser1");
        informationMap.put("dbUser1", "testUser");
        informationMap.put("dbPassword", "com.oracle");

        informationMap.put(null, "test");

        informationMap.put("cube", null);

        informationMap.put("dbPassword", "com.sql");

        System.out.println(informationMap);

        System.out.println(informationMap.get("dbPassword"));
        System.out.println(informationMap.get("dbUser1"));
        System.out.println(informationMap.get("dbUser"));
        System.out.println(informationMap.get(null));
        System.out.println(informationMap.get("cube"));

        System.out.println(informationMap.size());


        System.out.println(informationMap.containsKey("dbUser"));

        System.out.println(informationMap.containsValue("testUdfyguhijser"));


    }
}
