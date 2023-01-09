package kosta.basic.day015.api.calender;

import java.util.Calendar;
import java.util.stream.IntStream;

public class calenderQuiz2 {

    public static final char[] WEEK_DAYS = new char[]{'일', '월', '화', '수', '목', '금', '토'};
    private static int weekCounts;
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) {

        // 2023년 2월 달력 만들기
        // <2023년 2월>
        // 일 월 화 수 목 금 토
        //        1 2  3 4
        // 5 6 7 8  9  10 11

        int counts = getMonthCounts(2023, 2, 1);
        int dayBegins = getDayBegins(2023, 2, 1);

        drawDays();
        drawDates(counts, dayBegins);

        System.out.println(stringBuilder);
    }

    private static void drawDays() {
        IntStream.range(0, WEEK_DAYS.length)
                .mapToObj(i -> WEEK_DAYS[i])
                .forEach((v) -> stringBuilder.append(v).append("\t"));

        stringBuilder.append("\n");
    }

    private static void drawDates(int counts, int dayBegins) {
        weekCounts = dayBegins;
        stringBuilder.append("\t".repeat(dayBegins - 1));

        IntStream.range(1, counts + 1).forEach((x) -> {
            Runnable draw =
                    weekCounts < 7 ? () -> drawFirstWeek(x) :
                            x % 8 != 0 ? () -> stringBuilder.append(x).append("\t") :
                                    () -> stringBuilder.append("\n");
            draw.run();
        });
    }

    public static void drawFirstWeek(int date) {
        weekCounts++;
        stringBuilder.append(date).append("\t");
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
