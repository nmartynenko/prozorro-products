package ua.gov.prozorro.contrib.service.extract.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ua.gov.prozorro.contrib.model.ProductData;

import java.util.Collections;
import java.util.List;

@Service
public class NovusSiteExtractService extends AbstractSiteExtractService{

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public List<ProductData> extract() {
        //TODO implement
        logger.warn("IMPLEMENT ME!");
        return Collections.emptyList();
    }
}
