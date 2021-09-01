package nested;

public class Demo {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        OuterClass.InnerClass inner2 = outer.new InnerClass();
        System.out.println("outer num: " + outer.getNum());
        System.out.println("inner num: " + inner.getInnerNum());
        System.out.println("inner2 num: " + inner2.getInnerNum());
        System.out.println("**********");
        inner.setNum(5);
        inner.setInnerNum(4);
        System.out.println("outer num: " + outer.getNum());
        System.out.println("inner num: " + inner.getInnerNum());
        System.out.println("inner2 num: " + inner2.getInnerNum());
        System.out.println("*********");
        inner2.setNum(10);
        inner2.setInnerNum(7);
        System.out.println("outer num: " + outer.getNum());
        System.out.println("inner num: " + inner.getInnerNum());
        System.out.println("inner2 num: " + inner2.getInnerNum());
    }
}
