package classes.objects;

public class CovarianceDemo {
    public static void main(String[] args) {
       Person person = getPerson(0);
       Person teacher = getPerson(1);
       Person student = getPerson(2);
       Person student1 = getPerson(2);
       person = null;
        System.out.println("calling second method");
        System.out.println();
       IPerson student3 = getHuman(0);
       IPerson teacher3 = getHuman(1);
//       student3.greet()
        student3.hi();
    }

    public static Person getPerson(int i) {
        if (i==0) {
            return new Person();
        }
        if (i==1) {
            return new Teacher();
        }
        return new Student();
    }

    public static IPerson getHuman(int i) {
        if (i==0) {
            return new Student();
        }
        return new Teacher();
    }
}
