package bigDecimalTest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class BigDecimalArraySorter {

    public static void descSortStringArrayOfBigDecimal(String[] stringBigDecimals) {
        Arrays.sort(stringBigDecimals, (o1, o2) -> {
            BigDecimal bd1 = new BigDecimal(o1);
            BigDecimal bd2 = new BigDecimal(o2);
            return -bd1.compareTo(bd2);
        });
    }
}
