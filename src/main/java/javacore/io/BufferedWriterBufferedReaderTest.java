package javacore.io;

import java.io.*;

public class BufferedWriterBufferedReaderTest {
    public static void main(String[] args) throws IOException {
        String str = "File 5\n Hello JAVA World !!!\n buffered";
        File file = new File("/home/serezha/javaioread5.txt");

        //BufferedWriter test
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(str);
        bufferedWriter.newLine();
        bufferedWriter.write("New line");
        bufferedWriter.flush();

        bufferedWriter.close();
        fileWriter.close();

        //BufferedReader test
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        fileReader.close();
        bufferedReader.close();
    }
}