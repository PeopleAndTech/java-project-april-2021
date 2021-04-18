package fifthpackage.oop.inheritance;

public class B extends A {

    public static void main(String[] args) {
        B b = new B();
        b.methodFromA();
        b.methodFromB();

        A a = new A();
        a.methodFromA();
    }

    public void methodFromB() {
        System.out.println("method from B");
    }

    @Override
    public void methodFromA() {
        System.out.println(20 - 10);
    }
}
