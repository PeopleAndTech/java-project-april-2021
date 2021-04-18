package fifthpackage.oop.abstraction;

public abstract class Car extends Car2 {

    // method with body as well as method without body

    // abstract class can have constructor
    // still doesn't allow to create the object directly

    // you can only extend one abstract class  (for now)
    public Car() {

    }

    public void brake() {
        System.out.println("car has to stop via this ");
    }


    // if a method needs to be working as concept, you need to use the keyword abstract
    // abstract method -->  concept
    public abstract void wheels();


}
