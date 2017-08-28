package fwords;

/**sp[i]
 * Created by serezha on 14.08.17.
 */
public class Test {
    public static void main(String[] args) {
        String line = "And, he! she? \"works layin' whiskey\" down.";
        String[] sp;
        sp = line.split(" ");

        int index = 3;
        sp[index] = sp[index].substring(1, sp[index].length());
        System.out.println(sp[index]);

    }
}
