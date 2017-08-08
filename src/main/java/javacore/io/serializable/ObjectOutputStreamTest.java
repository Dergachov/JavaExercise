package javacore.io.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException {
        String file = "objectTestSerial.bin";

        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        TestSerial obj1 = new TestSerial("12", "Kevin", "001-56789");
        TestSerial obj2 = new TestSerial("25", "David", "002-76590");

        oos.writeObject(obj1);
        oos.writeObject(obj2);

        oos.flush();
        oos.close();
    }
}