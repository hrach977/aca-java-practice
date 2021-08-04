package solutions.hw1;

public class Loop5 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        while (i<=3) {
            System.out.println("Outer Loop: " + i);
            while(j<=3) {
                if (j==2) {
                    j++;
                    continue;
                }
                System.out.println("Inner Loop: " + j);
                j++;
            }
            i++;
        }
    }
}
