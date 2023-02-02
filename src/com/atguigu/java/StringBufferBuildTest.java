package com.atguigu.java;

import org.junit.Test;

/**
 * @author cs
 * @create 2023-01-31-16:20
 */
public class StringBufferBuildTest{

    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append("1");
        s1.append("2");
        System.out.println(s1);
    }

}
