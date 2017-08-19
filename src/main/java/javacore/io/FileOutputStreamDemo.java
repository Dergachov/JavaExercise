package javacore.io;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        String file = "/home/serezha/javaioread.txt";
        FileOutputStream fos = new FileOutputStream(file);
        FilterOutputStream filterOS = new FilterOutputStream(fos);

        byte[] b = "File 1 \nHello JAVA World!".getBytes();

        for (byte aB : b) {
            filterOS.write(aB);
        }

        fos.close();
        System.out.println("Done");
    }
}
