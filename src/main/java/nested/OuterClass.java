package nested;

public class OuterClass {

    private int num = 0;

    public int getNum() {
        return num;
    }

    public class InnerClass {

        private int num = 0;

        public void setNum(int num) {
            OuterClass.this.num = num;
        }

        public void setInnerNum(int num) {
            this.num = num;
        }

        public int getInnerNum() {
            return num;
        }
    }
}
