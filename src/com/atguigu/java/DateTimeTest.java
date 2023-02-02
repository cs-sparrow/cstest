package com.atguigu.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author cs
 * @create 2023-02-01-16:48
 */
public class DateTimeTest {

    /*calendar日历类

     */
    @Test
    public void test5(){
        //实例化
        Calendar calendar = Calendar.getInstance();

        //get
        int i = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i);
        //set
        calendar.set(Calendar.DAY_OF_MONTH,6);
        int i1 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i1);
        //add
        calendar.add(Calendar.DAY_OF_MONTH,10);
        int i2 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);
        //getTime
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime
        Date date1 = new Date();
        calendar.setTime(date1);
        int i3 = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(i3);


    }


    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf2.parse("2020-09-08");
        System.out.println(d);
        java.sql.Date sd = new java.sql.Date(d.getTime());
        System.out.println(sd);
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date dt = new Date();
        String format = sdf.format(dt);
        System.out.println(format);

        //************************************
        SimpleDateFormat sdf1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String format1 = sdf1.format(dt);
        System.out.println(format1);

        Date d1 = sdf1.parse("2023-02-23 17:33:20");
        System.out.println(d1);

    }


    @Test
    public void test2(){
        Date date = new Date(1675241715519L);
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }

    @Test
    public void test1(){
        long l = System.currentTimeMillis();
        System.out.println(l);
    }
}
