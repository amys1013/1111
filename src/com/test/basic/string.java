package com.test.basic;

import java.util.Arrays;

/**
 * 练习对字符串的操作
 */
public class string {
    public static void main(String[] args) {

        //1.字符 - 转化成小写
        char test = 'A';
        System.out.println(Character.toLowerCase(test));

        /**
         * String
         */
        String str1 = "Hello World!";
        String str2 = "New Tem.";

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);

        //1.获取字符串的长度
        int len = str1.length();
        System.out.println("1.字符串str1的长度：" + len);

        //2.返回指定位置的字符
        System.out.println("2.str1[4]:" + str1.charAt(4));

        //3.拼接两个String
        String res = str1.concat(str2);
        System.out.println("3.拼接后的字符串为（一般用+）:" + res);

        //4.将字符串转化成全小写的
        String lowerCaseString = res.toLowerCase();
        System.out.println("4.结果全部转化成小写：" + lowerCaseString);

        //5.将字符串转化成全大写的
        System.out.println("5.结果全部转化成大写：" + res.toUpperCase());

        //6.字符串的比较：比较内容是否相同
        System.out.println("6.equals比较字符串内容：" + "aaa".equals("aaa"));
        System.out.println("6-1.equals比较字符串内容(忽略大小写)：" + "aaa".equalsIgnoreCase("AAA"));


        String lStr = "abc123";
        String sStr = "abc";

        //7.判断子字符串
        System.out.println("7.'abc'是否为‘abc123’的子字符串:" + lStr.contains(sStr));

        //8.判断是否是特定字符串开始的
        System.out.println("8.'abc'是否为‘abc123’的前缀:" + lStr.startsWith(sStr));

        //9.判断是否是特定字符串结尾的
        System.out.println("9.'23'是否为‘abc123’的前缀:" + lStr.endsWith("23"));

        //10.获取子字符
        System.out.println("10.substring获取子字符:" + lStr.substring(2, 4));

        //11.获取指定字符串的下标
        System.out.println("11.获取指定字符串的其实下标:" + lStr.indexOf("23"));

        //12. 将字符串转化成数字
        System.out.println("12.将字符串转化成数字:" + Integer.parseInt("111"));

        //13.替换字符串
        System.out.println("13.将abc替换成ddd,并且返回新的字符串" + lStr.replace("abc", "ddd"));

        //14.返回特定字符分开的字符串数组
        String[] splitStr = "a,b,c,11,22".split(",");
        System.out.println("14.返回','分开的字符串数组,遍历得到:");
        for (String s : splitStr) {
            System.out.print(s+"\t");
        }

        System.out.println("\n");

    }
}
