package javacore.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by serezha on 12.08.17.
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {

        String file = "/home/serezha/javaioread.txt";

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);

        while (bis.available() != 0) {
            System.out.print((char) bis.read());
        }

        bis.close();
        fis.close();
    }
}
