package javachanges.java9.trywith;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Exercise0 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

        try (fileOutputStream) {
            byte[] b = "cwiczenia z JAZ'ow".getBytes();
            fileOutputStream.write(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
