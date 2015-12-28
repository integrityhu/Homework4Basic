package tasks;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeBasicTask {

    public static void useGregorianCalendar() {
        Date now = new Date();
        Calendar hourLimit = new GregorianCalendar();
        hourLimit.setTime(now);
        hourLimit.set(Calendar.MILLISECOND, 0);
        hourLimit.set(Calendar.SECOND, 0);
        hourLimit.set(Calendar.MINUTE, 0);
        System.out.println(hourLimit.getTime());
    }

}
