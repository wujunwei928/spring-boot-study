package cn.w3home.task.job;

import cn.hutool.core.date.DateUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class TaskJob {

    @Scheduled(cron = "0/10 * * * * ?")
    public void job1() {
        log.info("[ job 1 ] 开始执行: {}", DateUtil.formatDateTime(new Date()));
    }

    @Scheduled(fixedRate = 2000)
    public void job2() {
        log.info("[ job 2 ] 开始执行: {}", DateUtil.formatDateTime(new Date()));
    }

    @Scheduled(fixedDelay = 4000, initialDelay = 5000)
    public void job3() {
        log.info("[ job 3 ] 开始执行: {}", DateUtil.formatDateTime(new Date()));
    }
}
