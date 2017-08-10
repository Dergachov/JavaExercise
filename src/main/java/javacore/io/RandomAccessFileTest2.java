package javacore.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest2 {
    public static void main(String[] args) throws IOException {
        String file = "/home/serezha/javaioread.txt";
        RandomAccessFile raFile = null;
        int i;
        try {
            raFile = new RandomAccessFile(file, "rw");
            try {
                //RandomAccessFile writes below data in javaioread.txt
                raFile.write("This is example.".getBytes());
                //sets pointer just before "example" text
                raFile.seek(raFile.getFilePointer() - 9);
                //writes below text just after "This is "
                raFile.write(" RandomAccessFile example ".getBytes());
                //sets pointer at start to read data from start
                raFile.seek(0);
                while ((i = raFile.read()) != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            raFile.close();
        }
    }
}