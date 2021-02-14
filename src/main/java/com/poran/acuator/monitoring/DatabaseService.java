package com.poran.acuator.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DatabaseService  implements HealthIndicator {
    private final String DATA_BASE_SERVICE = "DataBaseService";
    @Override
    public Health health() {
      if (isDatabaseHealthIsGood()){
          return Health.up().withDetail(DATA_BASE_SERVICE,"Service is ruining").build();
      }
      return Health.down().withDetail(DATA_BASE_SERVICE,"Service is not available").build();
    }
    public boolean isDatabaseHealthIsGood(){
        // logic
        return true;

    }
}
