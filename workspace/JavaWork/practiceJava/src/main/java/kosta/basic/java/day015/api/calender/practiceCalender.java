package kosta.basic.java.day015.api.calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class practiceCalender {
    public static void main(String[] args) {
        getspecificDay();
    }

    private static void getspecificDay() {
        Calendar calendar = Calendar.getInstance();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm");
        String calenderString = simpleDateFormat.format(calendar.getTime());
//        System.out.println(calenderString);

        // 2023 ~ 2033 새해 요일을 구하자 ?!
        char[] week = {'일', '월', '화', '수', '목', '금', '토'};


        for (int i = 2023; i <= 2033; i++) {
            calendar.set(i, 0, 1);
            char day = week[calendar.get(Calendar.DAY_OF_WEEK) - 1];
            System.out.println(i + "년도 새해 요일은 " + day + "요일입니다");
        }
    }

    private static void calenderUsageEx2() {
        Calendar calendar = Calendar.getInstance();

        String year = calendar.get(Calendar.YEAR) + "년";
        String month = calendar.get(Calendar.MONTH) + 1 + "월";
        String date = calendar.get(Calendar.DATE) + "일";
        String hour = calendar.get(Calendar.HOUR) + "시";
        String minute = calendar.get(Calendar.MINUTE) + "분";

        System.out.printf("now %s %s %s %s %s\n", year, month, date, hour, minute);

        calendar.add(Calendar.DATE, 100);
        System.out.printf("future %s %s %s %s %s\n", year, month, date, hour, minute);

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
