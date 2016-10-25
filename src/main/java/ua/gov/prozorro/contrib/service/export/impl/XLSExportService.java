package ua.gov.prozorro.contrib.service.export.impl;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Service;

@Service
public class XLSExportService extends AbstractExcelExportService{
    @Override
    protected Workbook getWorkbook() {
        return new HSSFWorkbook();
    }
}
