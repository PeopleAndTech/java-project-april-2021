package fifthpackage.oop.encapsulation;

public class Peoplentech {

    public static void main(String[] args) {
        Student shadman = new Student();
        shadman.setName("Shadman Johar");
        shadman.setId(46789098);

        System.out.println(shadman.getId());

        Student tanzina = new Student();
        tanzina.setName("Tanzina Laskar");
        tanzina.setId(456754);

        System.out.println(tanzina.getName());


        System.out.println(tanzina);
        System.out.println(shadman);


    }
}
