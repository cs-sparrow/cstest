package com.atguigu.java;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author cs
 * @create 2023-02-01-21:29
 */
public class JDK8DateTimeTest {

    @Test
    public void test(){
        LocalDate now = LocalDate.now();
        LocalTime now2 = LocalTime.now();
        LocalDateTime now1 = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now2);
        System.out.println(now1);

        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 6, 10, 44, 44);
        System.out.println(localDateTime);

        System.out.println("修改");
        System.out.println("修改2");
    }
}
