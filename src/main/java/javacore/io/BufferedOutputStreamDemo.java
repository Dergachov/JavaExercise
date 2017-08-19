package javacore.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by serezha on 12.08.17.
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        String file = "/home/serezha/javaioread3.txt";
        byte[] array = new byte[]{74, 97, 118, 97};

        FileOutputStream fos = new FileOutputStream(file);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write(array);
        bos.flush();
        bos.close();
    }
}
