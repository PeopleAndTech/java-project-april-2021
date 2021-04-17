package fourthpackage;

public class ArrayPractice {

    public static void main(String[] args) {

        String name = "Rohan1, Rohan2, Rohan3";
        // System.out.println(name);

        String[] names = {"Julia", "Burhan", "Menad", "Pria", "Meron"};

        int[] years = {2022, 2025, 2029};
        boolean[] condition = {true, false, true};

        Object[] everything = {"USA", 2022, true};


        Object yearFromEverythign = everything[1];
        // System.out.println(yearFromEverythign);
        String data = names[0];
        // System.out.println(data);
        // System.out.println(years[2]);


        for (int i = 0; i < names.length; i++) {
            String dataOnLoop = names[i];
            System.out.println(dataOnLoop);
        }


    }
}
