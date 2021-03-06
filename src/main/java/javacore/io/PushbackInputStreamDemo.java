package javacore.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
    public static void main(String[] args) throws IOException {
        String str = "Hello JAVA World !!!";
        byte bytes[] = str.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        PushbackInputStream pbis = new PushbackInputStream(bais);

        int counter;
        while ((counter = pbis.read()) != -1) {
            if (counter == ' ') {
                System.out.print("_");
            } else if (counter == 'A') {
                System.out.print("$");
            } else if (counter == 'l') {
                System.out.print("1");
            } else {
                System.out.print((char) counter);
            }
        }

        pbis.close();
        bais.close();
    }
}
