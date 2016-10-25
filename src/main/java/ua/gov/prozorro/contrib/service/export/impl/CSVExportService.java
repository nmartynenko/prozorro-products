package ua.gov.prozorro.contrib.service.export.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ua.gov.prozorro.contrib.model.ProductData;
import ua.gov.prozorro.contrib.service.export.ExportService;

import java.util.List;

@Service
public class CSVExportService implements ExportService{

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void export(List<ProductData> productDatas) {
        //TODO implement
        logger.warn("IMPLEMENT ME!");
    }
}
