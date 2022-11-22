package tech.kp45.asset.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TImeoutMonitoring {
    @Scheduled(cron = "*/5 * * * * *")
    public void timeoutMonitoring() {
        System.out.println("timeoutMonitoring");
    }
}
