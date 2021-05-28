import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8, 5, 1, 2, 3, 4, 5, 10]) = 6.
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        //int max = 0;
        List<Integer> maxList = new ArrayList<>();
        int counter;
        for(counter=0;counter<=list.size()-1 ;counter++){
            int num1=counter;
            int num2=list.lastIndexOf(list.get(counter));
            int max=num2-num1+1;
            maxList.add(max);
        }

		int max=0;
        int a;
        for(a=0;a<=maxList.size()-1;a++){
            if(maxList.get(a)>=max){
                max= maxList.get(a);
            }
            else{

            }

        }
		
        return max;
    }
}