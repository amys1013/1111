package com.test.threadTest;

public class ThreadDemo {
    public static void main(String[] args) {
        //new 一个新线程对象
        MyThread myThread = new MyThread();
        // 【注】调用start方法启动线程(执行的还是run方法);
        myThread.start();

        for (int i = 0; i < 4; i++) {
            System.out.println("主线程执行输出" + i);
        }
    }
}


/**
 * 定义一个类线程类来继承Thread类
 */
class MyThread extends Thread {
    // 重写run方法，里面定义线程以后以后啊干什么
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(i + "子线程执行输出");
        }

    }
}
