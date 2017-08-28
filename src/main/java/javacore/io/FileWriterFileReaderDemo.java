package javacore.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterFileReaderDemo {
    public static void main(String[] args) throws IOException {
        String file = "/home/serezha/javaioread5.txt";
        FileWriter fw = new FileWriter(new File(file));

        fw.write("File 5\n Hello JAVA world!!");
        fw.flush();
        fw.close();

        FileReader fr = new FileReader(new File(file));
        System.out.println("FileReader.getEncoding() : " + fr.getEncoding());
        System.out.println("FileReader print from file: ");
        int count;
        while ((count = fr.read()) != -1) {
            System.out.print((char) count);
        }
        fr.close();
    }
}
