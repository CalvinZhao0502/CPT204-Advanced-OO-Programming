import java.util.*;

public class MatchSwap {

    /**
     * Modify a list of strings such that two strings with same
     * first letter are swapped.
     * For example, matchSwap(["ap", "bp", "cp", "aq", "cq", "bq"]) →
     * ["aq", "bq", "cq", "ap", "cp", "bp"].
     * @param list is a list of strings.
     * The strings are non-empty.
     * @return the modified list.
     */
    public static List<String> matchSwap(List<String> list) {
        /*Map<String, Integer> map = new HashMap<>();
        for(String word:list){
            map.put(word,0);
        }
		System.out.println(map);
        for(int a=1;a<=list.size()-1;a++){
            for(int b=0;b<=a-1;b++){
                if(list.get(a).charAt(0)==list.get(b).charAt(0)){
                    if(map.get(list.get(a))==0&&map.get(list.get(b))==0){
                        String a1=list.get(a);
                        String a2=list.get(b);
                        list.set(a, a2);
                        list.set(b, a1);
                        map.put(list.get(a),1);
                        map.put(list.get(b),1);
                    }
                }
            }
        }

        System.out.println(list);*/
        /*List<String> list1 = new ArrayList<>();
        for(int a=0;a<=list.size()-1;a++){
            list1.add(list.get(a));
        }

        for(int a=1;a<=list.size()-1;a++){
            for(int b=0;b<=a-1;b++){
                if(list.get(a).charAt(0)==list.get(b).charAt(0)){
                   if(list1.contains(list.get(a))==true&&list1.contains(list.get(b))==true){
                       String a1=list.get(a);
                       String a2=list.get(b);
                       list.set(a, a2);
                       list.set(b, a1);
                       list1.remove(a1);
                       list1.remove(a2);
                       System.out.println(list);
                       System.out.println(list1);

                   }
                }
            }
        }*/
        /*Map<String, String> map = new HashMap<>();
        for(int a=0;a<=list.size()-1;a++){
            map.put(Integer.toString(a)+"thSwapped:N ",list.get(a));

        }
        for(int a=1;a<=list.size()-1;a++){
            for(int b=0;b<=a-1;b++){
                if(list.get(a).charAt(0)==list.get(b).charAt(0)){

                }
            }
        }
        System.out.println(map);
        return list;*/
       //Another method
       /* List<String> newList=new ArrayList<String>();
        Map<String, String> map=new HashMap<String, String>();
        String newString;
        for(String x:list){
            String first=x.charAt(0)+"";
            if(!map.containsKey(first)){
                map.put(first, x);
                newList.add(x);
            }else{
                newString=map.get(first);
                int index=newList.indexOf(newString);
                newList.set(index, x);
                newList.add(newString);
                map.remove(first);
            }
        }
        System.out.println(newList);
        return newList;*/
        Map<Integer, String> map = new HashMap<>(); //Set up a new map to store the strings and their status
        int i = 0;
        for (String word : list) {
            map.put(i++, word);
            //System.out.println(map);
        }
        //System.out.println(map);
        for (int a = 1; a <= list.size() - 1; a++) {
            for (int b = 0; b <= a -1; b++) {
                if (list.get(a).charAt(0) == list.get(b).charAt(0)) { //The condition that the two strings have the same first letter
                    if ( (map.get(a).charAt(0) == map.get(b).charAt(0))) {
                        String a1 = list.get(a);
                        String a2 = list.get(b);
                        list.set(a, a2);
                        list.set(b, a1);
                        map.put(a, "*");
                        map.put(b, "/");
                        //System.out.println(map);
                    }
                }
            }
        }
        //System.out.println(list);
        return list;
    }

    public static void main(String[] args){

        matchSwap(Arrays.asList("ap", "bp", "cp", "cq", "cd","cp"));
        matchSwap(Arrays.asList("ab", "ac", "ad", "cd", "ae","am"));
    }
}
