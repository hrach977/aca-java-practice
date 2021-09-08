package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            list.add(i);
        }

        for (int i=0; i<Integer.MAX_VALUE; i++) {
            list.add(i);
        }
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            list.add(i);
        }
        for (int i=0; i<Integer.MAX_VALUE; i++) {
            list.add(i);
        }

    }
}
