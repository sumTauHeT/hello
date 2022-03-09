import java.util.Calendar;

public class L2013_1 {

    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        for(int year=1999 ;year <10000 ;year+=100){
            calendar.set(calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);
            calendar.set(Calendar.DAY_OF_MONTH,31);
            System.out.println(year+" "+calendar.get(Calendar.DAY_OF_MONTH));
            if(calendar.get(Calendar.DAY_OF_WEEK)==1){
                break;
            }
        }
    }
}
