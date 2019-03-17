package top.amazingwu.concurrent;

import java.util.concurrent.TimeUnit;

/**
 * @author amazingjadewu@163.com
 * @created 2019年03月17日17:31
 */
public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.scheduleAtFixedRate(()->{
            System.out.println("hello");
            System.out.println(System.currentTimeMillis());
        }, 1L, 1, TimeUnit.SECONDS);
    }
}
