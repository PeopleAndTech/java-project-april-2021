package fifthpackage;

public class CellPhone {

    // test comment

    // singleton class

    //1. private static object of the class (half way)
    private static CellPhone cellPhone = null;


    //2. private constructor
    private CellPhone() {

    }

    //3. public static method which has return type of the class (object) --> singleton method
    public static CellPhone getInstance() {
        if (cellPhone == null) {
            // (other half )
            cellPhone = new CellPhone();
        }
        return cellPhone;
    }


    public void printMyPhone() {
        System.out.println("Samsung");
    }

}
