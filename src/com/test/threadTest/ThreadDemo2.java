package com.test.threadTest;

/**
 * 学会创建线程的方式2，并理解优缺点
 */
public class ThreadDemo2 {
    public static void main(String[] args) {

        //3. 创建一个新的任务对象
        MyRunnable myRunnable = new MyRunnable();

        // 将这个任务对象交给Thread管理；
        new Thread(myRunnable).start();

        for (int i = 0; i < 2; i++) {
            System.out.println("主线程" + i);
        }

    }
}


/**
 * 1.定义一个线程任务类，实现Runnable接口
 */

class MyRunnable implements Runnable {
    // 2.重写run方法，定义线程的执行任务
    @Override
    public void run() {

        for (int i = 0; i < 3; i++) {
            System.out.println("子线程输出" + i);
        }
    }
}

