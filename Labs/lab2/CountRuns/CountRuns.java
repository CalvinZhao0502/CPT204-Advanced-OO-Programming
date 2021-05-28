import java.util.*;

public class CountRuns {

    /**
     * Count the number of runs in a list.
     * For example, countRuns([1, 2, 2, 2, 3]) = 1.
     * @param list is a list of integers.
     * @return the number of runs in list.
     */
    public static int countRuns(List<Integer> list) {
        /*int runs = 0;
        Map<Integer, Integer> map = new HashMap<>();
		for(Integer word : list){
            if (!map.containsKey(word)) {
                map.put(word, 1);
            }
            else{
               int num = map.get(word);
               map.put(word,num+1);
            }

        }
        //System.out.println(map);
        for(Integer value : map.values()){
            if(value>=2){

                runs++;
            }
            else{}

        }
        return runs;*/
        /*int runs = 0;
        int num = 1;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(Integer word:list){
            list1.add(word);
        }
        //System.out.println(list);
        //System.out.println(list1);
        for(int a=0;a<=list.size()-1;a++){
            for(int b=a+1;b<=list.size()-1;b++){
                if(list.get(a)==list.get(b)){
                   if(list1.contains(list.get(b))){
                       num++;
                       list2.add(num);
                       list1.remove(list.get(b));
                       list1.remove(list.get(a));

                   }

                }

            }

        }
        //System.out.println(list1);
        System.out.println(list2);
        for(int a=0;a<=list2.size()-1;a++){
            if(list2.get(a)>runs){
                runs=list2.get(a);
            }
            else{

            }
        }
        System.out.println(runs);*/
      /*  int runs=0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(Integer word:list){
            if(!list1.contains(word)){
                list1.add(word);
            }
            else{

            }
        }
        for(int s=0;s<=list1.size()-1;s++){
          for(int a=0;a<=list.size()-1;a++){
              int num=1;
              for(int b=a+1;b<=list.size()-1;b++){

                  if(list.get(a)==list1.get(s)&&list.get(b)==list1.get(s)){
                    num=num+1;

                    int index=list1.indexOf(list1.get(s));
                    list2.set(index,num);
                  }
                  list1.remove(list.get(a));
                  list1.remove(list.get(b));
              }


          }

        }
        System.out.println(list1);
        System.out.println(list2);*/
        int runs = 0;
       
        boolean isRun = false;
        for(int i = 0;i<list.size()-1;i++){
            while(i<list.size()-1&&list.get(i)==list.get(i+1)){
                i++;
                isRun=true;
            }
            if(isRun){
                runs++;
                isRun=false;
            }
        }
        return runs;


    }
    public static void main(String[] args){

        countRuns(Arrays.asList(1, 2,2,2, 3));
        countRuns(Arrays.asList(1, 1, 2, 3, 4, 5, 5));
        countRuns(Arrays.asList(1, 1, 2, 3, 4, 5, 5,6,6,7,7));
    }
}