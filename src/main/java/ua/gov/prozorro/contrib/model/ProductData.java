package ua.gov.prozorro.contrib.model;

import java.util.List;

public class ProductData {

    private int productDataCode;

    private String productTypeCode;

    private String generalProductName;

    private String generalProductNameRus;

    private List<PriceRow> priceRows;

    public int getProductDataCode() {
        return productDataCode;
    }

    public void setProductDataCode(int productDataCode) {
        this.productDataCode = productDataCode;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getGeneralProductName() {
        return generalProductName;
    }

    public void setGeneralProductName(String generalProductName) {
        this.generalProductName = generalProductName;
    }

    public String getGeneralProductNameRus() {
        return generalProductNameRus;
    }

    public void setGeneralProductNameRus(String generalProductNameRus) {
        this.generalProductNameRus = generalProductNameRus;
    }

    public List<PriceRow> getPriceRows() {
        return priceRows;
    }

    public void setPriceRows(List<PriceRow> priceRows) {
        this.priceRows = priceRows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductData that = (ProductData) o;

        if (productDataCode != that.productDataCode) return false;
        if (productTypeCode != null ? !productTypeCode.equals(that.productTypeCode) : that.productTypeCode != null)
            return false;
        if (generalProductName != null ? !generalProductName.equals(that.generalProductName) : that.generalProductName != null)
            return false;
        if (generalProductNameRus != null ? !generalProductNameRus.equals(that.generalProductNameRus) : that.generalProductNameRus != null)
            return false;
        return priceRows != null ? priceRows.equals(that.priceRows) : that.priceRows == null;

    }

    @Override
    public int hashCode() {
        int result = productDataCode;
        result = 31 * result + (productTypeCode != null ? productTypeCode.hashCode() : 0);
        result = 31 * result + (generalProductName != null ? generalProductName.hashCode() : 0);
        result = 31 * result + (generalProductNameRus != null ? generalProductNameRus.hashCode() : 0);
        result = 31 * result + (priceRows != null ? priceRows.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "productDataCode=" + productDataCode +
                ", productTypeCode='" + productTypeCode + '\'' +
                ", generalProductName='" + generalProductName + '\'' +
                ", generalProductNameRus='" + generalProductNameRus + '\'' +
                ", priceRows=" + priceRows +
                '}';
    }
}
