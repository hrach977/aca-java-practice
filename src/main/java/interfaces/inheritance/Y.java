package interfaces.inheritance;

public class Y implements X {
    {
        System.out.println(c);
    }

    public char methodX()
    {
        char c = X.c;

        return ++c;
    }
}
