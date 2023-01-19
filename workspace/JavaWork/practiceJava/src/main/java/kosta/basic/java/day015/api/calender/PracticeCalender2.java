package kosta.basic.java.day015.api.calender;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PracticeCalender2 {
    public static void main(String[] args) {
        // 입사일 입력 => 몇년 몇개월

        String pattern = "yyyy/MM/dd";
        DateFormat dateFormat = new SimpleDateFormat(pattern);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("날짜를 " + pattern + "형태로 입력하세요. (e.g. 2023/01/01): ");
        Date dateInput = null;

        while (scanner.hasNext()){
            try {
                dateInput = dateFormat.parse(scanner.nextLine());

            }catch (Exception e){
                System.out.println("다시 입력하세요 ");
            }


        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInput);

        Calendar today = Calendar.getInstance();

        long workDates = (today.getTimeInMillis() - calendar.getTimeInMillis()) / (24*60*60*1000);
        int date = (int) workDates/30;
        int year = date / 12;
        int month = date % 12;
        System.out.println(workDates);
    }
}
