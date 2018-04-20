package com.yikyung;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by u_kino07 on 2018. 4. 20..
 */
@Component
public class Alarm {
    @Scheduled(cron = "*/5 * * * * ?")
    public void console() {
        System.out.println(new Date());
    }
}
