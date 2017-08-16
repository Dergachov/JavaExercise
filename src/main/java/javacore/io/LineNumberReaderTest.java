package javacore.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/serezha/javaioread5.txt");
        FileReader fr;
        String str;

        fr = new FileReader(file);
        LineNumberReader lineNumberReader = new LineNumberReader(fr);
        while ((str = lineNumberReader.readLine()) != null) {
            System.out.print(lineNumberReader.getLineNumber() + " : ");
            System.out.println(str);
        }

        lineNumberReader.close();
        fr.close();

        System.out.println("After set line:");
        fr = new FileReader(file);
        LineNumberReader setLine = new LineNumberReader(fr);
        setLine.setLineNumber(10);
        while ((str = setLine.readLine()) != null) {
            System.out.print(setLine.getLineNumber() + " : ");
            System.out.println(str);
        }

        setLine.close();
        fr.close();
    }
}
