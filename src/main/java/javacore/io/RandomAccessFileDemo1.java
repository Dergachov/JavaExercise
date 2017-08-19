package javacore.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by serezha on 10.08.17.
 */
public class RandomAccessFileDemo1 {
    public static void main(String[] args) throws IOException {
        String file = "/home/serezha/javaioread.txt";
        System.out.println("First read file: ");
        read(file);
        for (int i = 0; i < 5; i++) {
            write(file, "Write String into file, index " + i + "\n");
        }
        System.out.println("\nSecond read file after write to it: ");
        read(file);
    }

    private static void read(String inputFile) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(inputFile, "r");
        int count;
        try {
            while ((count = raf.read()) != -1) {
                System.out.print((char) count);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        raf.close();
    }

    private static void write(String inputFile, String toWrite) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(inputFile, "rw");
        try {
            raf.seek(raf.length());
            raf.writeBytes(toWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
        raf.close();
    }
}
