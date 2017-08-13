package javacore.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by serezha on 12.08.17.
 */
public class DataInputStreamTest {
    public static void main(String[] args) throws IOException {

        String file = "/home/serezha/javaioread3.txt";

        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);

        while (dis.available() != 0) {
            System.out.print((char) dis.readByte());
        }

        fis.close();
        dis.close();
    }
}
