import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SameFirstLetter {

    /**
     * Create a map with first letter as key and words with that same
     * first letter separated by comma.
     * For example, numWords(["alice", "bob", "apple", "banana"]) →
     * {"a": "alice,apple", "b": "bob,banana"}.
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return a map with first letter and comma-separated-words pair.
     */
    public static Map<String, String> sameFirstLetter(List<String> list) {
        Map<String, String> answer = new HashMap<>();
        for(String word:list){
            if(!answer.containsKey(String.valueOf(word.charAt(0)))){
               //System.out.println(word.charAt(0));
                String s = String.valueOf(word.charAt(0));
                answer.put(s, word);
            }
            else{
                String s = String.valueOf(word.charAt(0));
                String ans = answer.get(String.valueOf(word.charAt(0)));
                String ans2=ans+","+word;
                answer.put(s, ans2);
                //answer.put(s,ans2.substring(0,ans2.length()-1));

            }
        }

        //System.out.println(answer);
		return answer;
		
    }





    public static void main(String[] args){

        sameFirstLetter(Arrays.asList("alice", "bob", "apple", "banana"));
    }
}