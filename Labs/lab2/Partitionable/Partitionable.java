import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
      /*  int numOfIntegers=list.size();
        int sum1=0;
        int sum2=0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
		for(int a=0;a<=numOfIntegers-1;a++){
		    sum1=sum1+list.get(a);
		    list1.add(sum1);
            //System.out.println(list1);
        }

        for(int a=0;a<=numOfIntegers-1;a++){
            sum2=sum2+list.get(numOfIntegers-a-1);
            list2.add(sum2);
            //System.out.println(list2);
        }

        for(int a=0;a<=list1.size()-1;a++){
            for(int b=0;b<=list2.size()-1;b++){
                if(list1.get(a)==list2.get(b)){
                    int c=a+b;
                    if(c== list1.size()-2){
                        return true;
                    }
                }
            }
        }
        return false;*/
        int flag = 0;
        for (int i = 0; i < list.size(); i ++) {
            int leftHalf = 0;
            int rightHalf = 0;
            for (int j = 0; j <= i; j ++) {
                leftHalf += list.get(j);
            }
            for (int k = list.size() - 1; k > i; k --) {
                rightHalf += list.get(k);
            }
            if (leftHalf == rightHalf) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return false;
        }
        return true;
    }


    public static void main(String[] args){

        isPartitionable(Arrays.asList(1, 1, 1, 2, 1));
    }
}