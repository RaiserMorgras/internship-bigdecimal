package bigDecimalTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestCases {

    @Test
    public void testCase1() {
        String[] input = {"-100",
                "50",
                "0",
                "56.6",
                "90",
                "0.12",
                ".12",
                "02.34",
                "000.000"};
        String[] expected = {"90",
                "56.6",
                "50",
                "02.34",
                "0.12",
                ".12",
                "0",
                "000.000",
                "-100"};
        String[] actualResult = input.clone();
        BigDecimalArraySorter.descSortStringArrayOfBigDecimal(actualResult);
        assertArrayEquals(expected,actualResult);
    }
}
