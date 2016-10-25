package ua.gov.prozorro.contrib.service.export.impl;

import org.apache.poi.ss.usermodel.Workbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ua.gov.prozorro.contrib.model.ProductData;
import ua.gov.prozorro.contrib.service.export.ExportService;

import java.util.List;

public abstract class AbstractExcelExportService implements ExportService{

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected abstract Workbook getWorkbook();

    @Override
    public void export(List<ProductData> productDatas) {
        Workbook workbook = getWorkbook();

        //TODO implement
        logger.warn("IMPLEMENT ME!");
    }
}
