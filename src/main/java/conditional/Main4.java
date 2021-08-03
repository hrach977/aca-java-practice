package conditional;

public class Main4 {
    public static void main(String[] args) {
        int num = 7;

        if ( (num < 6) || (num > 8) ) {
            System.out.println("at least one passed passed");
        } else {
            System.out.println("both failed");
        }
//        if ((num < 6) && (num > 8)) {
//            System.out.println("both conditions passed");
//        } else {
//            System.out.println("at least one condition didn't pass");
//        }
    }
}
