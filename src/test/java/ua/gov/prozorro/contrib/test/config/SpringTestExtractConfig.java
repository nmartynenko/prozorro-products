package ua.gov.prozorro.contrib.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan({
        "ua.gov.prozorro.contrib.service.extract",
        "ua.gov.prozorro.contrib.test.service.extract"
})
public class SpringTestExtractConfig {
}
