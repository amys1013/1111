package com.test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * java 8新的api 流：Stream - 可以以一种声明的方式处理数据
 * 数据源 流的来源。 可以是集合，数组，I/O channel， 产生器generator 等。
 * 聚合操作 类似SQL语句一样的操作， 比如filter, map, reduce, find, match, sorted等。
 */
public class stream {
    public static void main(String[] args) {

        // 创建数据源
        Integer[] numbeArr = {1, 2, 3, 6, 2, 3, 8};

        Stream<Integer> stream = Arrays.stream(numbeArr);
        //1.输出流numbeArr
        System.out.println("1.输出流的值：");
        //        stream1.forEach(e -> {
        //            System.out.println(e);
        //        });

        //2. 流转化成数组列表（返回的结果的长度不定，则不是数组）
        List<Integer> intList = Arrays.stream(numbeArr).filter(e -> e > 4).collect(Collectors.toList());
        System.out.println(intList.toString());
        // System.out.println(stream.limit(3));

        //3.
        List<Integer> iList = new ArrayList<>();
        iList.add(1);
        iList.add(14);
        iList.add(12);
        iList.add(3);
        iList.add(14);

        System.out.println("3-0.向List里面加入了" + iList.size() + "个元素");

        //3.流map的操作
        List<Integer> resList = iList.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println("3.元素1,14,12,3分别乘2后得到新的list：");
        resList.forEach(e -> {
            System.out.print(e+" ");
        });
        System.out.println("\n");

        //4.distinct操作,将List里面的数据进行去重
        System.out.println("4.流去重distinct后的结果是：");
        List<Integer> disList = iList.stream().distinct().collect(Collectors.toList());
        disList.forEach(e -> {
            System.out.print(e+" ");
        });

    }
}
