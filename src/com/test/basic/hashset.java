package com.test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 练习hashSet
 */
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> iSet = new HashSet<>();

        //1.add往set里面加数据
        iSet.add(2);
        iSet.add(6);
        iSet.add(1);
        iSet.add(6);

        System.out.println("1.加入4个数据后，set的输出:" + iSet.size());

        //2.contains判断元素是否存在
        System.out.println("2.contains判断元素是否存在" + iSet.contains(5));

        //3.remove删除元素
        iSet.remove(1);
        System.out.println("3.删除元素后的长度" + iSet.size());

        // 4.HashSet转化成ArrayList
        ArrayList<Integer> set2List = new ArrayList<>(iSet);
        System.out.println("4.HashSet转化成ArrayList:" + (set2List instanceof ArrayList));

        //4-1 ArrayList 化成数组
        Integer[] arr = set2List.toArray(new Integer[set2List.size()]);
        System.out.println("4-1 List转化成数组后输出第一个元素:" + arr[0]);


        set2List.add(6);
        //5.List 转化成set
        System.out.println("5-0.转化之前的list大小" + set2List.size());
        HashSet<Integer> l2Set = new HashSet<>(set2List);
        System.out.println("5-1转化成set后的长度:" + l2Set.size());

        System.out.println("输出转化后的set内容:" + l2Set);


        Integer[] intArr = {1, 2, 3, 4, 4, 4,};

        // 6.数组转化成set - 还可以遍历
        Set<Integer> se = Arrays.stream(intArr).collect(Collectors.toSet());

        System.out.println("6-1通过流将数组转化成set类型，用set容器来装数据:" + se);
        //6.1 遍历数组，加入到set中，进行数据去重；
        HashSet<Integer> set1 = new HashSet<>();

        for (int i = 0; i < intArr.length; i++) {
            set1.add(intArr[i]);
        }
        System.out.println("6-2遍历数组，将数据加入到set容器中:" + set1);

        //7.set类型转化成数组；
        Integer[] s2Arr = set1.toArray(new Integer[set1.size()]);
        System.out.println("set转化成数组，并输出第一个元素:" + s2Arr[0]);

    }
}
