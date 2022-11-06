package com.test.arrayTest;

import java.util.ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("mao","001",20));
        System.out.println(studentList);
    }
}


