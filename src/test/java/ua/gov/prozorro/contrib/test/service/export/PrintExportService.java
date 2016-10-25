package ua.gov.prozorro.contrib.test.service.export;

import org.springframework.stereotype.Service;
import ua.gov.prozorro.contrib.model.ProductData;
import ua.gov.prozorro.contrib.service.export.ExportService;

import java.util.List;

@Service
public class PrintExportService implements ExportService{
    @Override
    public void export(List<ProductData> productDatas) {
        productDatas.forEach(System.out::println);
    }
}
