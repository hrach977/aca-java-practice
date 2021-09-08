package inheritance;

public class Main {

    public static void main(String[] args) {
        Car troyka = new Bmw();
        Car niva = new Niva();
        Car cclass = new Mercedes();
        troyka.signal();
        niva.signal();
        cclass.signal();


    }
}
