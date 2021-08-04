package solutions.hw1;

public class Loop3 {
    public static void main(String[] args) {
        first:
        while (true) {
            System.out.println("first");
            second:
            while (true) {
                System.out.println("second");
                break first;
            }
//            break;
        }
    }
}
