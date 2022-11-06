package com.test.basic;

import java.sql.Array;
import java.util.*;

/**
 * hashMap 的操作
 */
public class hashMap {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        //1.put 往map里面添加键值对；
        map.put("1", "Monday");
        map.put("2", "Tuesday");
        map.put("3", "Wednesday");
        map.put("1", "Wednesday");

        System.out.println("初始化map:" + map);

        //2. 获取map的大小
        System.out.println("2.获取map的大小：" + map.size());

        //3. 通过get(key)获取到值；
        System.out.println("3.get获取到map对应的值" + map.get("2"));

        //4.remove删除map里面key对应的键值对；
        map.remove("2");
        System.out.println("4.通过remove()删除之后的map:" + map);

        //5.获取到map的所有key
        Set keys = map.keySet();
        System.out.println("5.获取到map的所有keys(为Set结构):"+map.keySet());

        //6.获取到map的所有values
        Collection<String> values = map.values();
        System.out.println("5-1.获取到map的所有values(为Collection结构):"+values);

        System.out.println(map.get("45"));

    }
}
