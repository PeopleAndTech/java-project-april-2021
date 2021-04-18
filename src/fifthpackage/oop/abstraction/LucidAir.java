package fifthpackage.oop.abstraction;

public class LucidAir extends RunableCarFord {

    public static void main(String[] args) {
        LucidAir lucidAir = new LucidAir();
        lucidAir.move();
        lucidAir.wheels();
        lucidAir.steeringWheel();
        lucidAir.tires();
    }

    // method overriding --> same method name, same params , but in different class
    // dynamic polymorphism / runtime polymorphism
    @Override
    public void wheels() {
        System.out.println("lucid has 5 wheels");
    }

    @Override
    public void move() {
        System.out.println("lucid moves silently");
    }


}
