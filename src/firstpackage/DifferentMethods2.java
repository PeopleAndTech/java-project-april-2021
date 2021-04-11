package firstpackage;

public class DifferentMethods2 {

    // main method --> always static
    public static void main(String[] args) {
        goDrinkCoffee();
        int dataFromMethod = getYear();
        System.out.println(dataFromMethod);
    }

    // void method --> performs some actions
    // static void method
    public static void goDrinkCoffee() {
        System.out.println("you drink coffee from starbucks");
    }

    // return type method --> returns some data
    // static return type
    public static int getYear() {
        return 2021;
        // String year = "2021";
        // return year;
    }

    // non static void method
    public void goDrinkTea() {
        System.out.println("you drink tea from starbucks");
    }

    // non static return type
    public String getState() {
        return "NY";
    }

}
