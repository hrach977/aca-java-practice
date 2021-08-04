package solutions.hw1;

public class Loop4 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if (i==4 || i==7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
