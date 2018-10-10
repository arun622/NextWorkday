package com.kinaxis.interview;

import java.util.*;

/**
 * Hello world!
 *
 */
public class Workday {

    private static boolean isWeekend(Calendar calendar){
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        if (dayOfWeek==1 || dayOfWeek== 7){
            return true;
        }
        else {
            return false;
        }
    }

    public static Date calculateWorkday(final Date startDate, final int numberOfWorkdays) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (isWeekend(calendar)){
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        for (int i=0; i<numberOfWorkdays; i++){
            while(isWeekend(calendar)){
                calendar.add(Calendar.DAY_OF_WEEK, 1);
            }
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }
        while (isWeekend(calendar)){
            calendar.add(Calendar.DAY_OF_WEEK, 1);
        }

        Date retval = calendar.getTime();
        return retval;
    }

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
}
