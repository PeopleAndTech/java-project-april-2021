package fifthpackage.oop;

public class CalculatorPolymorphism {

    // polymorphism - having many forms

    // method overloading  --> same method name, different params, in the same class
    // static polymorphism / compile time polymorphism


    public static void main(String[] args) {
        int x = claculator(10, 20);
        System.out.println(x);

        int y = claculator(10, 20, 11);
        System.out.println(y);
    }

    public static int claculator(int a, int b) {
        return a + b;
    }

    public static int claculator(int a, int b, int c) {
        return a + b + c;
    }


    // method overriding --> in the abstraction package
}
