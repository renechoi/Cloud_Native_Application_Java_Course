package kosta.basic.day015.api.calender.solution3;

import java.util.Arrays;
import java.util.Calendar;

public class Month {
    private static int[][] month = new int[6][7];
    private int monthCounts;
    private int monthFirstDay;

    private Month(int monthCounts, int monthFirstDay) {
        this.monthCounts = monthCounts;
        this.monthFirstDay = monthFirstDay;
    }

    public static Month of(int i) {

        int monthCounts = fetchMonthCounts(2023, i);
        int monthFirstDay = fetchMonthFirstDay(2023, i);
        createMonth(monthCounts, monthFirstDay);
        return new Month(monthCounts, monthFirstDay);
    }

    public static void createMonth(int monthCounts, int monthFirstDay) {

        monthCounts = 31;
        monthFirstDay = 0;

        for (int i = 0; i < month.length; i++) {
            for (int j = 0; j < month[i].length; j++) {
                month[i][j] = 0;
            }
        }

        System.out.println(Arrays.toString(month[0]));
        System.out.println(Arrays.toString(month[1]));
        System.out.println(Arrays.toString(month[2]));
        System.out.println(Arrays.toString(month[3]));
        System.out.println(Arrays.toString(month[4]));
        System.out.println(Arrays.toString(month[5]));
    }

    private static int fetchMonthCounts(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    private static int fetchMonthFirstDay(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        return calendar.getActualMaximum(Calendar.DATE);
    }
}
