package ua.gov.prozorro.contrib.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import ua.gov.prozorro.contrib.service.schedule.ScheduledService;
import ua.gov.prozorro.contrib.test.config.SpringTestSchedulerConfig;

@ContextConfiguration(classes = SpringTestSchedulerConfig.class)
public class SchedulerOnlyTest extends BaseSpringTest {

    @Autowired
    private ScheduledService scheduledService;

    @Test
    public void testScheduler() throws Exception{
        scheduledService.extractAndExport();
    }

}
