package javacore.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream stream;
        int counter;
        byte[] array = new byte[]{74, 97, 118, 97};

        stream = new ByteArrayInputStream(array);
        while ((counter = stream.read()) != -1) {
            System.out.print((char) counter);
        }
        stream.close();
    }
}
