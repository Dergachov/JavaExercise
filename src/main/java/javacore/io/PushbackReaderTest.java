package javacore.io;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderTest {
    public static void main(String[] args) throws IOException {
        String str = "Hello JAVA World !!!";
        char[] chars = str.toCharArray();
        CharArrayReader car = new CharArrayReader(chars);
        PushbackReader pbr = new PushbackReader(car);

        int counter;
        while ((counter = pbr.read()) != -1) {
            if (counter == ' ') {
                System.out.print("  ");
            } else if (counter == 'A') {
                System.out.print(":)");
            } else if (counter == 'l') {
                System.out.print("1");
            } else if (counter == '!') {
                System.out.print(":D");
            } else {
                System.out.print((char) counter);
            }
        }

        pbr.close();
        car.close();
    }
}
