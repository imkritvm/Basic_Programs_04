import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
      Calendar cal = Calendar.getInstance();
      System.out.println(cal.getTimeZone().getID());
      System.out.println(cal.getFirstDayOfWeek());
      System.out.println(cal.getWeekYear());
      System.out.println(cal.getTime());
      System.out.println(cal.getAvailableCalendarTypes());
      System.out.println(cal.getWeekYear());
      System.out.println(cal.get(Calendar.YEAR));
      System.out.println(cal.get(Calendar.MONTH));
      System.out.println(cal.get(Calendar.DAY_OF_MONTH));
    }
}

        
    