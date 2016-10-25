package ua.gov.prozorro.contrib.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import ua.gov.prozorro.contrib.test.config.SpringTestExportConfig;

@ContextConfiguration(classes = SpringTestExportConfig.class)
public class ExportTest extends BaseSpringTest {

    @Test
    public void dummy() throws Exception{
        //TODO implement
        logger.warn("IMPLEMENT ME!");
    }

}
