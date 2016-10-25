package ua.gov.prozorro.contrib.test;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import ua.gov.prozorro.contrib.test.config.SpringTestExtractConfig;

@ContextConfiguration(classes = SpringTestExtractConfig.class)
public class ExtractTest extends BaseSpringTest {

    @Test
    public void dummy() throws Exception{
        //TODO implement
        logger.warn("IMPLEMENT ME!");
    }

}
