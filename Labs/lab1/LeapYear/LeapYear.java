public class LeapYear {

    /**
     * Checks if an input year is a leap year.
     * @param year is the input year
     * Requires year to be a valid year
     * @return true iff year is a leap year
     */
    public static boolean isLeapYear(int year) {
		int testData1=year%4 ;
		int testData2=year%100 ;
		int testData3=year%400 ;
		if((testData1==0&&testData2!=0)||(testData3==0)){
            return true;
        }
		else{
            return false;
        }

    }

}

