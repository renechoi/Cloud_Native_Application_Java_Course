package kosta.basic.day015.api.calender;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class practiceCalender {
    public static void main(String[] args) {


    }

    private static void calenderUsageEx2() {
        Calendar calendar = Calendar.getInstance();

        String year = calendar.get(Calendar.YEAR) + "년";
        String month = calendar.get(Calendar.MONTH) +1 + "월";
        String date = calendar.get(Calendar.DATE) + "일";
        String hour = calendar.get(Calendar.HOUR) + "시";
        String minute = calendar.get(Calendar.MINUTE) + "분";

        System.out.printf("%s %s %s %s %s", year, month, date, hour, minute);
    }

    private static void calenderUsageEx1() {
        GregorianCalendar mereCalender = new GregorianCalendar();
        GregorianCalendar koreaCalender = new GregorianCalendar(Locale.KOREA);


        System.out.println(mereCalender);
        System.out.println(koreaCalender);


        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
    }
}
