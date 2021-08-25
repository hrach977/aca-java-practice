package classes.objects;
//minimal, and faulty representation
public class MySingleton {

    private int num;

    public static MySingleton INSTANCE = new MySingleton();

    private MySingleton() {

    }

    public int getNum() {
        return num;
    }

    public void setNum(int val) {
        num = val;
    }

}
