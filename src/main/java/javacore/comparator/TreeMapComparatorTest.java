package javacore.comparator;

import java.util.TreeMap;

public class TreeMapComparatorTest {
    public static void main(String[] args) {
        TreeMap<String, Integer> unsortedMap = new TreeMap<String, Integer>();
        unsortedMap.put("Hello", 1);
        unsortedMap.put("JAVA", 2);
        unsortedMap.put("World", 1);
        unsortedMap.put("!", 3);
        unsortedMap.put("?", 1);

        System.out.println(unsortedMap);

        /*//ex.1
        Comparator<String> comparator = new ComparatorByValue(unsortedMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(comparator);
        sortedMap.putAll(unsortedMap);*/

        //or like that
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(new ComparatorByValue(unsortedMap));
        sortedMap.putAll(unsortedMap);

        System.out.println(sortedMap);
    }
}
