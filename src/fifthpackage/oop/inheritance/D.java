package fifthpackage.oop.inheritance;

public class D extends A {
    // a parent can have multiple child class
    // but a child can't have multiple parent

    public static void main(String[] args) {
        D d = new D();
        d.methodFromA();
        d.methodFromD();
    }

    public void methodFromD() {
        System.out.println("method from D");
    }
}
