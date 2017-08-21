package javacore.io.serializable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String file = "objectTestSerial.bin";
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        TestSerial obj1 = (TestSerial) ois.readObject();
        TestSerial obj2 = (TestSerial) ois.readObject();

        System.out.println("obj1 " + obj1.getId() + " " + obj1.getName() + " " + obj1.getCard());
        System.out.println("obj2 " + obj2.getId() + " " + obj2.getName() + " " + obj2.getCard());
    }
}
