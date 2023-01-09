package kosta.basic.day015.api.calender;

import java.util.Calendar;
import java.util.stream.IntStream;

public class calenderQuiz2 {

    public static final char[] WEEK_DAYS = new char[]{'일', '월', '화', '수', '목', '금', '토'};
    private static int weekCounts;
    private static StringBuilder stringBuilder;

    public static void main(String[] args) {

        IntStream.range(1, 13).forEach((i)->{
            stringBuilder = new StringBuilder();
            stringBuilder.append(String.format("<%s월>",i)).append("\n");

            int monthCounts = getMonthCounts(2023, i, 1);
            int dayBegins = getDayBegins(2023, i, 1);

            drawDays();
            drawDates(monthCounts, dayBegins);

            System.out.println(stringBuilder+"\n");
        });
    }

    private static void drawDays() {
        IntStream.range(0, WEEK_DAYS.length)
                .mapToObj(i -> WEEK_DAYS[i])
                .forEach((v) -> stringBuilder.append(v).append("\t"));

        stringBuilder.append("\n");
    }

    private static void drawDates(int monthCounts, int dayBegins) {
        weekCounts = dayBegins;
        stringBuilder.append("\t".repeat(dayBegins - 1));

        IntStream.range(0, monthCounts).forEach((x) -> {
            Runnable draw =
                    (weekCounts + x) % 7 != 0 ? () -> stringBuilder.append(x + 1).append("\t") :
                            () -> stringBuilder.append(x + 1).append("\n");
            draw.run();
        });
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
