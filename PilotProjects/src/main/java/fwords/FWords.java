package fwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;

/**
 * Created by serezha on 14.08.17.
 * Frequency Dictionary v.0.1
 */
public class FWords {
    private static String line;
    private static String[] splitWords;
    private static TreeMap<String, Integer> words = new TreeMap<String, Integer>();
    private static TreeMap<String, Integer> sortedWords = new TreeMap<String, Integer>();


    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("/home/serezha/IdeaProjects/JavaExercise/Guardians of the Galaxy Vol. 2 (2017) [1080p] [YTS.AG].srt"));
        BufferedReader br = new BufferedReader(fr);



        /*while ((line = br.readLine()) != null) {
            if(line.length() > 2){
               String[] splits =  line.split(" ");
                for (int index = 0; index < splits.length; index++) {
                    System.out.println(splits[index]);
                }
            }
        }*/
        br.readLine();
        br.readLine();
        for (int stepLine = 0; (line = br.readLine()) != null; stepLine++) {
            //to lower case
            line = line.toLowerCase();
            // break from number and time line
            if (line.length() == 0) {
                br.readLine();
                br.readLine();
            }
            // For line with tag <i>

            splitWords = line.split(" ");
            splitWords = clearSplitWords(splitWords);
            addWords(splitWords);


        }
        System.out.println(words.size());

        TreeMap<String, Integer> result = new TreeMap<String, Integer>(new ComparatorByValue(words));
        result.putAll(words);

        System.out.println(result);

    }

    private static void addWords(String[] splitWords) {
        for (int index = 0; index < splitWords.length; index++) {
            if (!splitWords[index].equals("")) {
                if (words.containsKey(splitWords[index])) {
                    words.put(splitWords[index], words.get(splitWords[index]) + 1);
                } else {
                    words.put(splitWords[index], 1);
                }
            }
        }
    }

    private static String[] clearSplitWords(String[] words) {
        for (int index = 0; index < words.length; index++) {
            if (words[index].startsWith("<i>")) {
                words[index] = words[index].substring(3, words[index].length());
                clearSplitWords(words);
            }
            if (words[index].startsWith("- ")) {
                words[index] = words[index].substring(2, words[index].length());
                clearSplitWords(words);
            }
            if (words[index].startsWith("-")) {
                words[index] = words[index].substring(1, words[index].length());
                clearSplitWords(words);
            }
            if (words[index].startsWith("\"") || words[index].startsWith("\'")) {
                words[index] = words[index].substring(1, words[index].length());
                clearSplitWords(words);
            }
            if (words[index].endsWith("\"") || words[index].endsWith("\'")) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                clearSplitWords(words);
            }
            if (words[index].endsWith(",") || words[index].endsWith(".")) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                clearSplitWords(words);
            }
            if (words[index].endsWith(":") || words[index].endsWith(";")) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                clearSplitWords(words);
            }
            if (words[index].endsWith("!") || words[index].endsWith("?")) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                clearSplitWords(words);
            }
            if (words[index].endsWith(".")) {
                words[index] = words[index].substring(0, words[index].length() - 1);
                clearSplitWords(words);
            }
            if (words[index].endsWith("</i>")) {
                words[index] = words[index].substring(0, words[index].length() - 4);
                clearSplitWords(words);
            }

        }
        return words;
    }
}
