package fifthpackage.oop.abstraction;

public class Execution {

    public static void main(String[] args) {
        RunableCarFord ford = new RunableCarFord();
        ford.move();
        ford.start();
        ford.stop();
        ford.name();
        ford.wheels();
        ford.brake();

    }
}
