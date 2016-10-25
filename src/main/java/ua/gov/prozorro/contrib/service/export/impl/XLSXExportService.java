package ua.gov.prozorro.contrib.service.export.impl;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

@Service
public class XLSXExportService extends AbstractExcelExportService{
    @Override
    protected Workbook getWorkbook() {
        return new XSSFWorkbook();
    }
}
