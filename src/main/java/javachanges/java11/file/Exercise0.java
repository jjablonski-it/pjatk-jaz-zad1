package javachanges.java11.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise0 {
    public static void main(String[] args) throws IOException {
        Path newFile = Path.of("cwiczenia4.txt");
        Path existingFile = Path.of("test.txt");

        System.out.println(Files.readString(existingFile));
        Files.writeString(newFile, "test test test elo");
        //Files readString writeString
    }
}
