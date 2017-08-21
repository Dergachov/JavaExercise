package javacore.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "/home/serezha/javaioread.txt";
        File file = new File(path);

        System.out.println("file.getName() " + file.getName());
        System.out.println("file.canRead() " + file.canRead());
        System.out.println("file.canWrite() " + file.canWrite());
        System.out.println("file.exists() " + file.exists());
        System.out.println("file.getAbsolutePath() " + file.getAbsolutePath());
        System.out.println("file.getCanonicalPath() " + file.getCanonicalPath());
        System.out.println("file.getParent() " + file.getParent());
        System.out.println("file.getPath() " + file.getPath());
        System.out.println("file.isAbsolute() " + file.isAbsolute());
        System.out.println("file.isDirectory() " + file.isDirectory());
        System.out.println("file.isFile() " + file.isFile());
        System.out.println("file.isHidden() " + file.isHidden());
        System.out.println("file.hashCode() " + file.hashCode());

        File dirLists = new File(file.getParent());
        String[] lists = dirLists.list();
        if(lists.length > 0){
            for (String list : lists) {
                System.out.println(list);
            }
        }
        //file.deleteOnExit();
    }
}
