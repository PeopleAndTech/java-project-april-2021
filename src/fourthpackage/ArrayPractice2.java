package fourthpackage;

public class ArrayPractice2 {

    public static void main(String[] args) {

        //        String[] names = {"Julia", "Burhan", "Menad","Pria","Meron"};

        String[] names = new String[5];


        try {
            names[0] = "Julia";
            names[1] = "Burhan";
            names[2] = "Menad";
            names[3] = "Pria";
            names[4] = "Meron";
            // names[5] = "Meron";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fix the our of bound exception, theres more data than it should be");
            e.printStackTrace();
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //  System.out.println(names[10]);


        String[] newNames = names.clone();
        System.out.println(newNames.length);


    }
}
