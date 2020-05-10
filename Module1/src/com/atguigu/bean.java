package com.atguigu;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//单行注释
/*
    多行注释
 */

/**
 *文档注释
 */
class Bean {
    public static void main(String[] args) {
        System.out.println("helloworld 2");
        ArrayList a = new ArrayList();
        Map map=new HashMap<>();
        test1();
        //test
        //        method();

    }

    public static void test1() {
        //region Description
        Bean b=new Bean();
        b.test11();
        b.test12();
        b.test13();
        b.test14();
        //endregion
    }

    public static void method(){
        try {
            FileInputStream in = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void test11(){
        //测试字面量在常量池里的地址和字面量的结合
        String str1 ="hello world";
        String str2 ="hello";
        String str3 =str2+" world";
        System.out.println(str1==str3);
    }
    public void test12(){
        String str1 ="hello world";
        final String str2 ="hello";
        String str3 =str2+" world";
        System.out.println(str1==str3);
    }
    public void test13(){
        String str1 ="hello world";
        final String str2 =new String("hello");
        String str3 =str2+" world";
        System.out.println(str1==str3);
    }
    public void test14(){
        String str1 ="hello world";
        String str2 ="hello";
        String str3 =" world";
        String str4 = str2+str3;
        System.out.println("str2:"+str2.hashCode());
        System.out.println("str3:"+str3.hashCode());
        System.out.println("str1:"+str1.hashCode());
        System.out.println("str4:"+str4.hashCode());
        System.out.println(str1==str4);
        System.out.println(str1==str4.intern());
    }

}
