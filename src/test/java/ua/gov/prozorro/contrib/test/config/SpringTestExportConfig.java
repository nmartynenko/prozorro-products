package ua.gov.prozorro.contrib.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/application.properties")
@ComponentScan({
        "ua.gov.prozorro.contrib.service.export",
        "ua.gov.prozorro.contrib.test.service.export"
})
public class SpringTestExportConfig {
}
