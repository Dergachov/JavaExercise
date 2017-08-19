package javacore.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        //PrintStream to Console
        PrintStream psConsole = new PrintStream(System.out);

        psConsole.write("PrintStream to Console".getBytes());
        psConsole.flush();
        psConsole.close();

        //PrintStream to File
        PrintStream psFile = new PrintStream(new File("/home/serezha/javaioread4.txt"));

        psFile.write("PrintStream write to file /home/serezha/javaioread4.txt".getBytes());
        psFile.flush();
        psFile.close();
    }
}
