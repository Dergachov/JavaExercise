package javacore.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayOutputStreamTest {
    public static void main(String[] args) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] array = new byte[]{74, 97, 118, 97};

        try {
            baos.write(array);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        byte[] readStream = baos.toByteArray();
        System.out.println("Call baos.toString() -> " + baos.toString());
        System.out.println("Call Arrays.toString(readStream) -> " + Arrays.toString(readStream));
    }
}
