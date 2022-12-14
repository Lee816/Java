import java.util.*;

public class CalenfarTest {
    public static void main(String[] args) {
        long millis = System.currentTimeMillis();
        System.out.println(millis/1000/24/60/60);

        Date d = new Date();
        System.out.println(d);
        Date dd = new Date(d.getTime()+24*60*60*1000);
        System.out.println(dd);

        Calendar cal1970 = Calendar.getInstance();
        cal1970.set(19700,1-1,1); // 0월 ~ 12월, 1970.1.1

        Calendar today = Calendar.getInstance();
        printCalendar(today);
        long minus = today.getTimeInMillis()-cal1970.getTimeInMillis();
        System.out.println(minus);
        System.out.println(minus/1000/24/60/60);
    }

    public static void printCalendar(Calendar c){
        System.out.println("-----------------------------");
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.AM_PM)); //1 = pm 0 =am
    }
}
