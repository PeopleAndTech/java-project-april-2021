package secondpackage;

public class CalculatorExecution {

    // create a class and a non static void method
    // create another class named as ObjectCreationExecution and a main method
    // do the required to call the non static method from the first class to
    // ObjectCreationExecution

    // classThatYouWantToCreateObjectOf ObjectName/ReferrenceVariable = new
    // nameOfTheConstructor();

    public static void main(String[] args) {
        Calculator.doAddition();

        Calculator calculator = new Calculator();

    }

}
