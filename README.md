# 简介
基于java8中的ScheduledTheadPoolExecutor进行改造以支持Cron表达式。   
Cron表达式的解析采用cron-utils。  

# 使用  
使用的方法与原生的ScheduledTheadPoolExecutor相似，你可以很容易的定义你的调度策略。  
```
CronScheduledThreadPoolExecutor cronScheduledCronThreadPoolExecutor = new CronScheduledThreadPoolExecutor(4);
        cronScheduledCronThreadPoolExecutor.scheduleWithCron(() -> {
            System.out.println("hello");
        }, "/1 * * * * ? *", CronType.QUARTZ);
        cronScheduledCronThreadPoolExecutor.scheduleWithCron(() -> {
            System.out.println("------");
        }, "/2 * * * * ? *", CronType.QUARTZ);
```
而cron-utils支持多种Cron表达式语法，所以上手起来也会很方便。  