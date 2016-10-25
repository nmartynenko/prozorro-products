package ua.gov.prozorro.contrib.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan({
        "ua.gov.prozorro.contrib.service.schedule",
        "ua.gov.prozorro.contrib.test.service"
})
public class SpringTestSchedulerConfig {
}
