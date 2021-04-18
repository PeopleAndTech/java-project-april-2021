package fifthpackage;

public class CellPhoneExecution {

    public static void main(String[] args) {
        CellPhone cellPhone = CellPhone.getInstance();

        CellPhone cellPhone2 = CellPhone.getInstance();

        //CellPhone cellPhone4 = new CellPhone();
        // CellPhone cellPhone3 = new CellPhone();

        cellPhone.printMyPhone();
        cellPhone2.printMyPhone();
    }
}
