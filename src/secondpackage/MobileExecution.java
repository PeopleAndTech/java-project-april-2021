package secondpackage;

public class MobileExecution {

    public static void main(String[] args) {

        Mobile mobile = new Mobile("android");
        mobile.printMakeOfMobile("Apple");
        mobile.printMakeOfMobile(2222);

        mobile.printMakeOfMobile("Samsung", 2222);

    }
}
