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
        int tempMax=0;
        while(!minPQ2.isEmpty()){
            tempMax = 0;
            CourseActivity endActivity=minPQ2.delMin();
            ArrayList<CourseActivity>addBackList = new ArrayList<>();
            while(!minPQ1.isEmpty()&&minPQ1.getMin().getDay()==endActivity.getDay()&&minPQ1.getMin().getStartTime()<endActivity.getEndTime()){
                CourseActivity startActivity = minPQ1.delMin();
                tempMax += startActivity.getNumStudents();
                if(startActivity.getEndTime()>endActivity.getEndTime()) {
                    addBackList.add(startActivity);
                }
            }
            if(!addBackList.isEmpty()){
                for (CourseActivity addBackActivity:addBackList) {
                    minPQ1.add(addBackActivity,addBackActivity.getDay()*100+addBackActivity.getStartTime());
                }
            }
            if(tempMax>max)
                max=tempMax;
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

//    public class MaxAttendance {
//
//        private ALBinHeap<CourseActivity> minPQ1;
//        private ALBinHeap<CourseActivity> minPQ2;
//
//
//        // LAB 14 PART B MAX ATTENDANCE
//
//        public MaxAttendance(ArrayList<CourseActivity> activities) {
//            this.minPQ1=new ALBinHeap<CourseActivity>();
//            this.minPQ2=new ALBinHeap<CourseActivity>();
//            for(CourseActivity activity:activities){
//                minPQ1.add(activity, activity.getDay()*100+activity.getStartTime());
//                minPQ2.add(activity,activity.getDay()*100+activity.getEndTime());
//            }
//
//        }
//        public int maxAttendance() {
//            int max=0;
//            int tempMax=0;
//            while(!minPQ2.isEmpty()){
//                tempMax = 0;
//                CourseActivity endActivity=minPQ2.delMin();
//                while(!minPQ1.isEmpty()&&minPQ1.getMin().getDay()==endActivity.getDay()&&minPQ1.getMin().getStartTime()<endActivity.getEndTime()){
//                    CourseActivity startActivity = minPQ1.delMin();
//                    tempMax+=startActivity.getNumStudents();
//                }
//                if(tempMax>max)
//                    max=tempMax;
//            }
//            return max;
//        }

    }
    


