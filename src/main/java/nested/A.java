package nested;

public class A {
     private int member;

     class B {
         void getAMember(A a) {
             System.out.println(a.member);
         }
     }
}
