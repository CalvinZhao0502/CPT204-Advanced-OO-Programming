import java.util.*;

public class EvenAppend {

    /**
     * Append words that appear the 2nd, 4th, 6th, etc. time in a list.
     * For example, evenAppend(["a", "b", "b", "a", "a", "b", "b"]) → "bab".
     *
     * @param list is a list of words.
     * @return a concatenation of even appearing words.
     */
    public static String evenAppend(List<String> list) {
        Map<String, Integer> map = new HashMap<>();
        int num;
        String res = "";
        for (String word : list) {

            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                num = map.get(word);
                map.put(word, num + 1);
                if ((num + 1) % 2 == 0) {
                    res = res + word;
                }
            }
        }



        return res;

    }
}