package ua.gov.prozorro.contrib.service.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ua.gov.prozorro.contrib.model.ProductData;
import ua.gov.prozorro.contrib.service.export.ExportService;
import ua.gov.prozorro.contrib.service.extract.ExtractService;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScheduledService {

    @Autowired
    private List<ExtractService> extractServices;

    @Autowired
    private List<ExportService> exportServices;

    @Scheduled(cron = "${cron.expression}", zone = "${cron.timezone}")
    public void extractAndExport(){
        List<ProductData> productDatas = new LinkedList<>();

        for (ExtractService extractService: extractServices){
            productDatas.addAll(extractService.extract());
        }

        for (ExportService exportService: exportServices){
            exportService.export(groupByProductCode(productDatas));
        }
    }

    private List<ProductData> groupByProductCode(List<ProductData> productDatas) {
        // FIXME: 25.10.16 make actual implementation
        return productDatas;
    }

}
