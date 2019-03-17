package top.amazingwu.concurrent;

import com.cronutils.model.CronType;

/**
 * @author amazingjadewu@163.com
 * @created 2019年03月17日17:31
 */
public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) {
        CronScheduledThreadPoolExecutor cronScheduledCronThreadPoolExecutor = new CronScheduledThreadPoolExecutor(4);
        cronScheduledCronThreadPoolExecutor.scheduleWithCron(() -> {
            System.out.println("hello");
        }, "/1 * * * * ? *", CronType.QUARTZ);
        cronScheduledCronThreadPoolExecutor.scheduleWithCron(() -> {
            System.out.println("------");
        }, "/2 * * * * ? *", CronType.QUARTZ);
    }
}
