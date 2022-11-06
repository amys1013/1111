package com.test.threadTest;

import java.util.concurrent.Callable;

/**
 * 目标：学会创建线程的第3种方式：实现callable接口，结合FutureTask完成。
 */
public class ThreadDemo3 {
    public static void main(String[] args) {

    }
}

/**
 *  1.定义一个任务类 实现callable接口，应该声明线程任务执行完毕后结果的数据类型；
 */
class myCallable implements Callable<String>{
    private  int n;
    /**
     * 2.重写call方法(任务方法)
     */
    @Override
    public String call() throws Exception {
        return null;
    }
}
