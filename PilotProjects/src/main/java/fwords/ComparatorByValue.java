package fwords;

import java.util.Comparator;
import java.util.TreeMap;

public class ComparatorByValue implements Comparator {
    TreeMap<String, Integer> unsortedMap;

    public ComparatorByValue(TreeMap<String, Integer> unsortedMap) {
        this.unsortedMap = unsortedMap;
    }

    public int compare(Object o1, Object o2) {
        int value1 = unsortedMap.get(o1);
        int value2 = unsortedMap.get(o2);
        if (value1 < value2) {
            return 1;
        } else {
            return -1;
        }
    }
}
