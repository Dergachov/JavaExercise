package javacore.io;

import java.io.*;

public class CharArrayWriterCharArrayReaderDemo {
    public static void main(String[] args) throws IOException {
        char c[] = {'H', 'e', 'l', 'l', 'o', ' ', 'J', 'A', 'V', 'A', ' ', 'W', 'o', 'r', 'l', 'd', '!'};

        //CharArrayWriter test
        CharArrayWriter caw = new CharArrayWriter();
        caw.write(c);

        FileWriter fw = new FileWriter(new File("/home/serezha/javaioread5.txt"));
        caw.writeTo(fw);

        fw.close();
        caw.close();

        //CharArrayReader test
        CharArrayReader arrayReader1 = new CharArrayReader(c);
        CharArrayReader arrayReader2 = new CharArrayReader(c, 6, 4);
        int count;

        System.out.print("arrayReader1: ");
        while ((count = arrayReader1.read()) != -1) {
            System.out.print((char) count);
        }

        System.out.print("\narrayReader2: ");
        while ((count = arrayReader2.read()) != -1) {
            System.out.print((char) count);
        }

        arrayReader1.close();
        arrayReader2.close();
    }
}
