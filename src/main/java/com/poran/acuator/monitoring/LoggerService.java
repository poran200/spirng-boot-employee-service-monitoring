package com.poran.acuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    private final String LOGGER_SERVICE= "Logger service";



    @Override
    public Health health() {
        if (isLoggerServicesIsGood()){
            return Health.up().withDetail(LOGGER_SERVICE,"Logger service is running").build();
        }
        return Health.down().withDetail(LOGGER_SERVICE,"Logger service  not available").build();
    }
    private boolean isLoggerServicesIsGood(){
        // logic
        return  true;
    }
}
