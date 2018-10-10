package com.kinaxis.interview;

import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class WorkdayTest {

    private Workday classUnderTest;

    @Before
    public void setUp() throws Exception{
        classUnderTest = new Workday();
    }

    @Test
    public void testCalculateWorkday() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        //sanity Test when startDate is not a workday
        Date startDate = sdf.parse("2018-10-13");
        Date date = sdf.parse("2018-10-15");
        //assertEquals(date, Workday.calculateWorkday(startDate, 0));

        //sanity test when startDate is a workday
        startDate = sdf.parse("2018-10-09");
        assertEquals(startDate, Workday.calculateWorkday(startDate, 0));

        //returning workdays within same week
        date = sdf.parse("2018-10-10");
        assertEquals(date, Workday.calculateWorkday(startDate, 1));
        date = sdf.parse("2018-10-11");
        assertEquals(date, Workday.calculateWorkday(startDate, 2));
        date = sdf.parse("2018-10-12");
        assertEquals(date, Workday.calculateWorkday(startDate, 3));

        //returning workdays after weekend (following week)
        date = sdf.parse("2018-10-15");
        assertEquals(date, Workday.calculateWorkday(startDate, 4));
        date = sdf.parse("2018-10-16");
        assertEquals(date, Workday.calculateWorkday(startDate, 5));

        //returning workdays after 2 weekends
        date = sdf.parse("2018-10-22");
        assertEquals(date, Workday.calculateWorkday(startDate, 9));
        date = sdf.parse("2018-10-23");
        assertEquals(date, Workday.calculateWorkday(startDate, 10));

        //returning workdays in the following month
        date = sdf.parse("2018-11-01");
        assertEquals(date, Workday.calculateWorkday(startDate, 17));
        date = sdf.parse("2018-11-02");
        assertEquals(date, Workday.calculateWorkday(startDate, 18));

        //returning workdays in the following month after a weekend in the month
        date = sdf.parse("2018-11-05");
        assertEquals(date, Workday.calculateWorkday(startDate, 19));
    }
}
