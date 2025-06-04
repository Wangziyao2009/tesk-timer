package com.example.demo.Tesk;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
//@EnableScheduling
public class Tesk {

    public List<Integer> list = new ArrayList<>();

    int i = 1;

//    //每六秒执行一次
//    @Scheduled(cron ="*/6 * * * * ?")
//    public void tesk1() {
//        System.out.println("hello");
//    }
//
//    //每三秒执行一次
//    @Scheduled(fixedDelay = 3000)
//    private void tesk2() {
//        System.out.println("word");
//    }
//
//    //启动服务器后10秒才执行，以后每一次执行间隔都是10秒
//    //initialDelay/开始的延迟    fixedRate/固定日期
//    @Scheduled(initialDelay = 10000, fixedRate = 10000)
//    private void tesk3() {
//        System.out.println("我是一个10秒任务");
//    }
//
//    //定时往List集合添加数据
//    @Scheduled(fixedDelay = 1000)
//    private void tesk4() {
//        list.add(0);
//        System.out.println(list);
//    }

    //定义只有延迟的定时器，好像只执行一次
    @Scheduled(initialDelay = 100)
    private void tesk5() {
        System.out.println("tesk5执行了"+ i +"次");
        i++;
    }


}
