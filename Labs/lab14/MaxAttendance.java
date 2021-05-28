import java.util.ArrayList;

public class MaxAttendance {

    ALBinHeap<CourseActivity> minPQ1 ;
    ALBinHeap<CourseActivity> minPQ2;

    // LAB 14 PART B MAX ATTENDANCE


    public MaxAttendance(ArrayList<CourseActivity> activities) {
         this.minPQ1=new ALBinHeap<>();
         this.minPQ2=new ALBinHeap<>();
        for (CourseActivity item:activities) {
            minPQ1.add(item,item.getDay()*100+item.getStartTime());
            minPQ2.add(item,item.getDay()*100+item.getEndTime());
        }


    }
    public int maxAttendance() {
        int max=0;
        int temp=0;
        while(minPQ2.size()>0){
            if(minPQ2.size()==1){
                temp=minPQ2.getMin().getNumStudents();
                if (temp>max)
                {
                    return temp;
                }
                else {
                    return max;
                }
            }


            temp = 0;
            CourseActivity item1=minPQ2.delMin();
            while(minPQ1.size()>0&&minPQ1.getMin().getDay()*100+minPQ1.getMin().getStartTime()< item1.getDay()*100+item1.getEndTime()){
                CourseActivity item2 = minPQ1.delMin();
                temp+=item2.getNumStudents();
            }
            if(temp>max)
                max=temp;
        }
        return max;
    }


//    public int maxAttendance() {
//        int temp3=0;
//       int temp;
//       int max=0;
//       while(minPQ2.size()>=1){
//           if(minPQ1.size()==1){
//               if(minPQ2.getMin().getEndTime()>minPQ1.getMin().getStartTime()){
//                   if(minPQ1.getMin().getNumStudents()>max)
//                       max=minPQ1.getMin().getNumStudents();
//                       return max;
//               }
//
//           }
//           CourseActivity item1=minPQ2.getMin();
//           CourseActivity item2=minPQ1.getMin();
//           if((item1.getDay()*100+item1.getEndTime())>(item2.getDay()*100+item2.getStartTime())){
//               temp=item1.getNumStudents();
//               if(temp>max){
//                   max=temp;
//
//               }
//               int temp1=temp;
//
//
//               minPQ1.delMin();
//               CourseActivity item3=minPQ1.getMin();
//               if((item1.getDay()*100+item1.getEndTime())<(item3.getDay()*100+item3.getStartTime())){
//
//                   minPQ2.delMin();
//               }
//               else{
//                   temp=item3.getNumStudents();
//
//                   minPQ2.delMin();
//                   if(temp+temp1+temp3>max){
//                       max=temp+temp1;
//                   }
//
//
//
//
//               }
//           }
//
//
//           }
//        return max;
//       }


    }


