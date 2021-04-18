package fifthpackage.oop.abstraction;

public class RunableCarFord extends Car implements Vehicle, Vehicle3 {

    // interface (idea) --> implement
    // abstract class --> extend
    // we extend first, then implement

    // you can only extend one  class in regular class as well


    @Override
    public void move() {
        System.out.println("ford moves");
    }

    @Override
    public void start() {
        System.out.println("ford starts");

    }

    @Override
    public void stop() {
        System.out.println("ford stops");

    }

    @Override
    public void name() {
        System.out.println("name is ford");

    }

    @Override
    public void wheels() {
        System.out.println("ford has 4 wheels");
    }

    @Override
    public void steeringWheel() {
        System.out.println("from ford");
    }

    @Override
    public void tires() {
        System.out.println("tires from ford");
    }
}
