package javacore.io;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringWriterStringReaderDemo {
    public static void main(String[] args) throws IOException {
        //StringWriter test
        String file = "/home/serezha/javaioread5.txt";
        StringWriter sw = new StringWriter();

        sw.write(file, 6, 7);
        System.out.println("StringWriter to string: " + sw.toString());

        StringBuffer sbuf = sw.getBuffer();
        sbuf.append(file);
        System.out.println("StringWriter to stringBuff: " + sw.toString());

        sw.close();

        //StringReader test
        StringReader sr = new StringReader(file);
        int count;
        System.out.print("StringReader from var String: ");
        while ((count = sr.read()) != -1) {
            System.out.print((char) count);
        }
        sr.close();
    }
}
