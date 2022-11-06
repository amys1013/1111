package com.test.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ArrayList的练习操作  -  【数组列表】
 * 提供arrayList来存储不限定个数的对象 - ArrayList 是一个泛型类
 */
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();

        System.out.println("1.判断集合是否为空:isEmpty" + cities.isEmpty());

        //2. 集合里面添加元素，默认是末尾；
        System.out.print("2.集合里面添加元素，默认是末尾:\n");
        cities.add("chongqing");
        cities.add("sichuan");
        cities.add("shanghai");
        cities.add(cities.size(), "beijing");

        for (String e : cities) {
            System.out.println(e);
        }

        //3. 获取集合的长度
        System.out.println("3.目前集合的大小：" + cities.size());

        //4.删除指定的元素
        cities.remove("sichuan");
        System.out.println("4.删除集合中sichuan后长度：" + cities.size());

        // cities.remove(1);
        // System.out.println("4-1.删除集合下标为1后长度："+cities.size());

        //5.set修改指定下标的元素
        System.out.println("5.set修改指定下标的元素：" + cities.set(0, "ww"));

        //6.get获取指定下标的元素
        System.out.println("6.get获取指定下标的元素：" + cities.get(0));

        //7.获取到指定元素的下标
        System.out.println("7.获取到指定元素的下标:" + cities.indexOf("hua"));

        //8.判断集合是否包含某元素
        System.out.println("8.判断集合是否包含某元素:" + cities.contains("ww"));


        //9.Arrays.sort是对数组进行排序，这里是用Collections.sort()对数组列表进行排序；
        Collections.sort(cities);
        System.out.println("9.Collections.sort对数组列表排序后的结果：");
        for (String e : cities) {
            System.out.println(e);
        }

        System.out.println("-------------");

        Integer[] number = {1, 2, 3, 6, 2, 3, 8};
        //        ArrayList<Integer> numList;
        //10.Arrays.asList(arr)将
        //        ArrayList<Integer> numList = Arrays.asList(number);
        //10. 将数组转化成一个arraylist 数组列表
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(number));
        System.out.println("10.数组->成数组列表后的长度：" + numList.size());

        //11.将数组列表转化成数组

        Integer[] toArr = new Integer[numList.size()];
        numList.toArray(toArr);
        System.out.println("11.数组列表->成数组后的数组长度(注意数组要初始化长度)：" + toArr.length);
    }
}
