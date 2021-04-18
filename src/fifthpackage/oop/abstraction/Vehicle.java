package fifthpackage.oop.abstraction;

public interface Vehicle extends Vehicle2, Vehicle4 {

    // interface --> idea --> no solid plans
    // concepts -- only method name, no method body
    // can't have constructor --> can't create object
    // in interface all the methods are public & abstract by default

    // you can have multiple interface extending one to another

    void move();

    void start();

    void stop();

    void name();

}
