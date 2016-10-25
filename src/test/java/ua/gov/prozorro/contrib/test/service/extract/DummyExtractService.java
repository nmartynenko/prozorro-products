package ua.gov.prozorro.contrib.test.service.extract;

import org.springframework.stereotype.Service;
import ua.gov.prozorro.contrib.model.PriceRow;
import ua.gov.prozorro.contrib.model.ProductData;
import ua.gov.prozorro.contrib.service.extract.ExtractService;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

@Service
public class DummyExtractService implements ExtractService{

    private List<ProductData> dummy;

    public DummyExtractService() {
        dummy = new LinkedList<>();

        //sample prices for Кефір 1%
        ProductData kefir1p = new ProductData();
        kefir1p.setProductDataCode(1);
        kefir1p.setProductTypeCode("CPV: 15500000-3 Молочні продукти");
        kefir1p.setGeneralProductName("Кефір 1 %");
        kefir1p.setGeneralProductNameRus("Кефир 1 %");

        List<PriceRow> kefir1prices = new LinkedList<>();

        PriceRow novus1kefir1p = new PriceRow();
        novus1kefir1p.setSite("https://novus.zakaz.ua");
        novus1kefir1p.setSiteProductName("Кефир Белая линия 1% пластиковая бутылка 900г Украина");
        novus1kefir1p.setProductPrice(new BigDecimal("18.59"));
        novus1kefir1p.setPricePerKilo(new BigDecimal("20.65"));
        kefir1prices.add(novus1kefir1p);

        PriceRow novus2kefir1p = new PriceRow();
        novus2kefir1p.setSite("https://novus.zakaz.ua");
        novus2kefir1p.setSiteProductName("Продукт кисломолочний з Біфідобактеріями Біфідо 1,0% Біла лінія пл/п. 900г");
        novus2kefir1p.setProductPrice(new BigDecimal("19.29"));
        novus2kefir1p.setPricePerKilo(new BigDecimal("21.43"));
        kefir1prices.add(novus2kefir1p);

        kefir1p.setPriceRows(kefir1prices);

        dummy.add(kefir1p);

        //sample prices for Сметана 15%
        ProductData smetana = new ProductData();
        smetana.setProductDataCode(1);
        smetana.setProductTypeCode("CPV: 15500000-3 Молочні продукти");
        smetana.setGeneralProductName("Сметана 15%");
        smetana.setGeneralProductNameRus("Сметана 15%");

        List<PriceRow> smetana1prices = new LinkedList<>();

        PriceRow novus1smetana = new PriceRow();
        novus1smetana.setSite("https://novus.zakaz.ua");
        novus1smetana.setSiteProductName("Сметана Гармония 15% 350г пленка Украина");
        novus1smetana.setProductPrice(new BigDecimal("16.21"));
        novus1smetana.setPricePerKilo(new BigDecimal("46.31"));
        smetana1prices.add(novus1smetana);

        PriceRow novus2smetana = new PriceRow();
        novus2smetana.setSite("https://novus.zakaz.ua");
        novus2smetana.setSiteProductName("Сметана Белая линия 15% 200г пластиковый стакан Украина");
        novus2smetana.setProductPrice(new BigDecimal("9.38"));
        novus2smetana.setPricePerKilo(new BigDecimal("46.90"));
        smetana1prices.add(novus2smetana);

        smetana.setPriceRows(smetana1prices);

        dummy.add(smetana);
    }

    @Override
    public List<ProductData> extract() {
        return dummy;
    }
}
