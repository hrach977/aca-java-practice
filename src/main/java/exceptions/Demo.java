package exceptions;

import java.io.PrintWriter;

public class Demo {

    public static void main(String[] args) {
//        PrintWriter writerObj = null;
//        try {
//            writerObj = new PrintWriter(System.out);
//
//            writerObj.write("Dzone article");
////            throw new Exception();
////            writerObj.flush();
//        }  finally {
//            System.out.println("finally executed!!!!!");
//            if (writerObj != null) {
//                writerObj.close();
//            }
//        }
        //m3();

        try (PrintWriter writer = new PrintWriter(System.out)) {
            //code1
            //code2
        }
    }

    public static void m1() throws Exception {
        throw new Exception();
    }

    public static void m2() {
        try {
            m1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void m3() {
        m2();
    }

}
