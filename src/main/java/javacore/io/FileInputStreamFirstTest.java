package javacore.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class FileInputStreamFirstTest {
    public static void main(String[] args) throws IOException {

        String file = "/home/serezha/javaioread.txt";
        InputStream stream = new FileInputStream(file);
        int counter;

        /*
        System.out.println("Simple: ");
        while((counter = stream.read()) != -1){
            System.out.print((char)counter);
        }*/

        System.out.println("With buffer:");
        byte[] buffer = new byte[10];
        while ((counter = stream.read(buffer)) != -1) {
            System.out.println("Counter: " + counter + " " + new String(buffer, 0, counter));
        }
    }
}
