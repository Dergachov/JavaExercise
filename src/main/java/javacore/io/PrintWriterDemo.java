package javacore.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {

        //PrintWriter to file
        PrintWriter pwFile = new PrintWriter(new File("/home/serezha/javaioread4.txt"));

        pwFile.write("PrintWriter write to file /home/serezha/javaioread4.txt");
        pwFile.flush();
        pwFile.close();

        //PrintWriter to console
        PrintWriter pwConsole = new PrintWriter(System.out);

        pwConsole.write("PrintWriter write to Console");
        pwConsole.flush();
        pwConsole.close();


    }
}
