package nested;

public class Enclosing {

    private static int num;

    public static void doSmth() {

    }

    public static class StaticNested {

        public void setNum(int val) {
            num = val;
            doSmth();
        }

    }
}
