package kosta.basic.day015.api.calender.solution3;

import java.util.List;
import java.util.stream.IntStream;

public class Year {
    private static List<Month> months;

    public static Year createYear() {
        IntStream.range(1, 13).forEach((i) -> {
                Month month = Month.of(i);
                months.add(month);
        });
        return new Year();
    }


}
