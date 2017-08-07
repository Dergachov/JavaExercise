package javacore.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamException {
    public static void main(String[] args) throws IOException {
        String file = "/home/serezha/javaioread.txt";
        InputStream stream = null;
        int counter;
        try {
            stream = new FileInputStream(file);
            System.out.println("With buffer:");
            byte[] buffer = new byte[10];
            while ((counter = stream.read(buffer)) != -1) {
                System.out.println("Counter: " + counter + " " + new String(buffer, 0, counter));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stream != null) {
                    stream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
