package javacore.io;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

/**
 * Created by serezha on 12.08.17.
 */
public class FilePermissionTest {

    private static String file = "/home/serezha/javaioread.txt";
    private static PermissionCollection pc = null;

    public static void main(String[] args) throws IOException {
        try {
            // create new file permissions
            FilePermission fp = new FilePermission(file, "execute");

            // create new permission collection
            pc = fp.newPermissionCollection();

            // add permission to the permission collection
            pc.add(fp);

            // tests if the file permission is read
            TestFileReadPermission(file);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // method to test file permission
    private static void TestFileReadPermission(String path) {
        if (pc.implies(new FilePermission(file, "read"))) {
            System.out.println("Permission for " + path + " is read");
        } else {
            System.out.println("Permission for " + path + " not set for read");
        }
    }
}
