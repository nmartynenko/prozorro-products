package ua.gov.prozorro.contrib.service.export;

import ua.gov.prozorro.contrib.model.ProductData;

import java.util.List;

public interface ExportService {

    void export(List<ProductData> productDatas);

}
