package solutions;

import java.io.*;

public class Dummy {
    public static void main(String[] args) {
        DataInputStream dis = new DataInputStream(System.in);
        try {
            int i = dis.readInt();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
