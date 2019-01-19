package com.infoshare.academy.data.structures.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTask {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd hh:mm");

        Calendar calendar = new GregorianCalendar();
        System.out.println("---- Before:");
        System.out.println("Date : " + sdf.format(calendar.getTime()));

        calendar.add(Calendar.DAY_OF_MONTH, 17);

        System.out.println("--------------------------");
        calendar.set(Calendar.HOUR, 11);
        calendar.set(Calendar.MINUTE, 23);

        System.out.println("Date : " + sdf.format(calendar.getTime()));


    }
}
