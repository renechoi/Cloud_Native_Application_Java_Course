package kosta.basic.day015.api.calender.solution2;

import java.util.Calendar;

public class calenderQuiz {
    public static void main(String[] args) {

        // 2023년 2월 달력 만들기
        // <2023년 2월>
        // 일 월 화 수 목 금 토
        //        1 2  3 4
        // 5 6 7 8  9  10 11

        int counts = getMonthCounts(2023, 2, 1);
        int dayBegins = getDayBegins(2023, 2, 1);

        char[] week = {'일', '월', '화', '수', '목', '금', '토'};

        int weekCounts = 0;
        weekCounts = weekCounts + dayBegins;

        StringBuilder stringBuilder = new StringBuilder();

        drawDays(week, stringBuilder);
        drawDates(counts, dayBegins, weekCounts, stringBuilder);

        System.out.println(stringBuilder);
    }

    private static void drawDates(int counts, int dayBegins, int weekCounts, StringBuilder stringBuilder) {
        stringBuilder.append("\t".repeat(dayBegins -1));

        for (int i = 1; i <= counts; i++) {
            stringBuilder.append(i).append("\t");
            weekCounts++;

            if (weekCounts == 8) {
                weekCounts = 1;
                stringBuilder.append("\n");
            }
        }
    }

    private static void drawDays(char[] week, StringBuilder stringBuilder) {
        for (char day : week) {
            stringBuilder.append(day).append("\t");
        }
        stringBuilder.append("\n");
    }

    private static int getDayBegins(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, date);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private static int getMonthCounts(int year, int month, int date) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, date);
        return calendar.getActualMaximum(Calendar.DATE);
    }

}
