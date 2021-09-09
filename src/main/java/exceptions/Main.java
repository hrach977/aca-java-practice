package exceptions;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static exceptions.SomeClass.method1;

public class Main {

    public static void main(String[] args)  {
//            method1();

        Path fileName = Path.of("demo.txt");
        String content  = "hello world !!";
        try {
            Files.writeString(fileName, content);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String actual = null;
        try {
            actual = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(actual);
    }

    public static void method2() throws IOException {
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
