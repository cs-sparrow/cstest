package com.atguigu.java;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author cs
 * @create 2023-01-31-13:47
 */
public class StringMethodTest {

    @Test
    public void test6(){

        String s1 = "abc123中国";
        byte[] bytes = s1.getBytes();
        System.out.println(Arrays.toString(bytes));
        try {
            byte[] bytes2 = s1.getBytes("gbk");
            System.out.println(Arrays.toString(bytes2));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void test5(){
         String s1 = "helloworld";
         char[] chr = s1.toCharArray();
         for(int i=0;i<chr.length;i++){
             System.out.println(chr[i]);
         }
         char[] chr2 = {'h','e','l','l','o'};
         String s2 = new String(chr2);
        System.out.println(s2);

    }

    @Test
    public void test4(){
        String s1 = "北北京有点热北京";
        String s2 = s1.replace('北','东');
        System.out.println(s2);
        String s3 = "12hello34world56java78mysql";
        String s4 = s3.replaceAll("\\d+",",");
        System.out.println(s4);
        String s5 = s4.replaceAll("^,|,$","");
        System.out.println(s5);
    }

    @Test
    public void test3(){
        String s1 = "helloworld";
        boolean b = s1.endsWith("ld");
        System.out.println(b);
        System.out.println(s1.startsWith("hello"));
        System.out.println(s1.endsWith("dd"));
        System.out.println(s1.indexOf("ll"));
        System.out.println(s1.indexOf("ll", 5));
        System.out.println(s1.lastIndexOf("ld"));
    }

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));

        String s3 = "陈司是个大帅哥";
        System.out.println(s3.substring(2));
        System.out.println(s3.substring(2,5));

    }

    @Test
    public void test1(){
        String s1 = "helloword";
        String s2 = "   huh  jdkjs  sdff";
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.trim());
    }

}
