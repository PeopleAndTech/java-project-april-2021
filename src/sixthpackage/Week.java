package sixthpackage;

public class Week {

    private final Days days;

    public Week(Days days) {
        this.days = days;
    }

    public static void main(String[] args) {
        Week week = new Week(Days.Tuesday);
        week.whatToDo();

    }

    public void whatToDo() {
        switch (days) {
            case Friday:
                System.out.println("I'll play soccer");
                break;
            case Tuesday:
                System.out.println("I'll play cricket");
                break;
            case Sunday:
            case Monday:
                System.out.println("I'll play guitar");
                break;
            default:
                System.out.println("I'll go to work");
        }
    }

}
