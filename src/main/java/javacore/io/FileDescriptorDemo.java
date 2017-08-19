package javacore.io;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDescriptorDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis1 = new FileInputStream(new File("/home/serezha/javaioread.txt"));
        FileInputStream fis2 = new FileInputStream(new File("/home/serezha/javaioread1.txt"));
        FileDescriptor fd1 = fis1.getFD();
        FileDescriptor fd2 = fis2.getFD();

        System.out.println("HashCode: " + fd1.hashCode());
        System.out.println("HashCode: " + fd2.hashCode());

        fis1.close();
        fis2.close();
    }
}
