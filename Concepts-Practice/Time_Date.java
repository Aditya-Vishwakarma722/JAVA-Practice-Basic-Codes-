import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Time_Date {
    static void main() {

        //Date and Time in JAVA

        System.out.println("Milliseconds Passed Since 1970 : "+System.currentTimeMillis()+" milliSec.");
        System.out.println("Seconds Passed Since 1970 : "+System.currentTimeMillis()/1000+" Sec.");
        System.out.println("Minutes Passed Since 1970 : "+System.currentTimeMillis()/1000/60+" Min.");
        System.out.println("Hours Passed Since 1970 : "+System.currentTimeMillis()/1000/3600+" Hrs.");
        System.out.println("Days Passed Since 1970 : "+System.currentTimeMillis()/1000/3600/24+" Days");
        System.out.println("Months Passed Since 1970 : "+System.currentTimeMillis()/1000/3600/24/30+" Months");
        System.out.println("Years Passed Since 1970 : "+System.currentTimeMillis()/1000/3600/24/30/12+" Years");

        Date d = new Date();
        Calendar c = new GregorianCalendar();
        System.out.println("\n" +d);
        System.out.println(c.getCalendarType()+" Calender");
        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+ " : "+Calendar.MINUTE);

        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        System.out.println("\n"+ld+"\n"+lt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String myDate = dtf.format(ld);
        System.out.println("\n"+myDate);
    }

}
