package secondpackage;

public class Calculator {

    // constructor --> same name of the class name
    public Calculator() {

    }

    // sysout + control + spacebar --> printline shortcut

    // main method
    public static void main(String[] args) {
        doAddition();
        int x = getDataFromMath();
        System.out.println(x + 10);

        // object creation
// classThatYouWantToCreateObjectOf ObjectName/ReferrenceVariable = new nameOfTheClass();

        Calculator objectOfCalculator = new Calculator();
        objectOfCalculator.doAddition2();
        objectOfCalculator.getDataFromMath2();

    }

    // static void
    public static void doAddition() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + " from doAddition");
    }

    // static return type
    public static int getDataFromMath() {

        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + " from getDataFromMath");
        return c;
    }

    // non static void --> in order to run non static
    // method we would need to create object of the class
    public void doAddition2() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + " from doAddition2");
    }

    // non static return type
    public int getDataFromMath2() {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c + " from getDataFromMath2");
        return c;
    }

    public void doMath(int a, int b) {
        System.out.println(a + b);
    }

    public void doMath(int a, int b, int c) {
        int x = a + b;
        int z = x - c;
        System.out.println(z);
    }

    public void doMath(int a, int b, String data) {
        System.out.println(a + b + data);
    }

}
