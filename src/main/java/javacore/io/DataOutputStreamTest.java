package javacore.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by serezha on 12.08.17.
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws IOException {
        String file = "/home/serezha/javaioread3.txt";

        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Hello JAVA World !!!");
        dos.flush();

        dos.writeDouble(10.877);
        dos.writeBoolean(true);
        dos.flush();

        dos.close();
        fos.close();
    }
}
