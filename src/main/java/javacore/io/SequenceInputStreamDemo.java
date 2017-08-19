package javacore.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by serezha on 12.08.17.
 */
public class SequenceInputStreamDemo {
    private static SequenceInputStream sis = null;
    private static FileInputStream fis1 = null;
    private static FileInputStream fis2 = null;
    private static FileInputStream fis3 = null;

    public static void main(String[] args) throws IOException {
        String path = "/home/serezha/";
        ArrayList<FileInputStream> fileInputStreams = new ArrayList<FileInputStream>();

        try {
            FileInputStream fis1 = new FileInputStream(path + "javaioread.txt");
            FileInputStream fis2 = new FileInputStream(path + "javaioread1.txt");
            FileInputStream fis3 = new FileInputStream(path + "javaioread2.txt");

            fileInputStreams.add(fis1);
            fileInputStreams.add(fis2);
            fileInputStreams.add(fis3);

            Enumeration enumerationStreams = Collections.enumeration(fileInputStreams);
            sis = new SequenceInputStream(enumerationStreams);

            int count;
            while ((count = sis.read()) != -1) {
                System.out.print((char) count);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis1 != null) {
                    fis1.close();
                }
                if (fis2 != null) {
                    fis2.close();
                }
                if (fis3 != null) {
                    fis3.close();
                }
                if (sis != null) {
                    sis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
