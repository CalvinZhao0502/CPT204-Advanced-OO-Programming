public class ConcatContain {

    /**
     * Compute the smallest number of times source is concatenated with itself
     * so that the resulting string contains target.
     * For example, For example, source "ab" concatenated 2 times "ab"+"ab"+"ab" into "ababab"
     * contains target "baba".
     * @param source a non-empty string to be concatenated.
     * @param target a non-empty string that can be contained in repeatedly concatenated source.
     * @return the smallest number of times of the concatenation.
     */
    public static int concatContain(String source, String target) {
       /* int i;
        int answer;
        String source1=source;
        for(i=0;i<=100000;i++){
            String newSource=source+source1;
            if(newSource.contains(target)==true){
                answer=i+1;
                return answer;
                // break;
            }
            else{
                source=newSource;

            }
        }
        return -1;*/
        /*int length1=source.length();
        int length2=target.length();
        String source1=source;
        for(int i=0;i<(length1/length2)+1;i++){
            String newSource=source+source1;
            if(newSource.contains(target)){
                return i+1;

            }
            else{
                source=newSource;
            }

        }*/
        String ss = source;
        int s = source.length();
        int t = target.length();
        String sub = target.substring(0,s);
        //System.out.println(sub);
        for (int i = 0; i <((t/s)+1 ); i++) {
            source = source.concat(source);
            if (ss.equals(target)) {
                return 0;
            }
            else if (source.contains(target)) {
                if (sub.equals(ss)) {
                    return i+1;
                }
                else {
                    return i+2;
                }
            }
        }
        return -1;
    }


    }