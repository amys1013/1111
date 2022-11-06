package com.test.basic;

import java.util.Arrays;

/**
 * 练习对数组的操作
 * 数组长度已经，不能增删值
 * 后续可以根据Arrays 对数组进行: 单值填充、数组升序、得到数组中的最大值、最小值、升序后二分查找指定元素的下标；
 */
public class shuzu {

    public static void main(String[] args) {
        // 1.初始化长度为10的数组
        int[] arr = new int[10];
        // Arrays.fill(arr,1); //通过Arrays来填充数组 - 当前，所有的操作都基于数组已经给定了长度

        // 2.填充值
        for (int i = 0; i < 10; i++) {
            arr[i] = (int) (Math.random() * 10);
        }

        // 3.修改值
        arr[0] = 100;
        //        for (int e : arr) {
        //            System.out.println(e);
        //        }

        //4.累加
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        System.out.println("数组总长度为:" + total);

        //5.找到最大的数
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("通过Arrays.stream(arr).max().getAsInt()得到的最大值：" + max);

        // 6.排序后二分查找指定的数；
        Arrays.sort(arr); // 将数组进行升序
        int findIndex = Arrays.binarySearch(arr, 100);
        System.out.println("排序后进行二分查找100得到的下标：" + findIndex);
        //        for (int e : arr) {
        //            System.out.println(e);
        //        }

        //7.获得数组中的最小值
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);

        //8.比较数组的内容是否相同
        int b[] = new int[10];
        System.out.println(Arrays.equals(arr,b));
    }
}
