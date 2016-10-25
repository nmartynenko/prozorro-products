package ua.gov.prozorro.contrib.model;

import java.math.BigDecimal;

public class PriceRow {

    private String site;

    private String siteProductName;

    private BigDecimal productPrice;

    private BigDecimal pricePerKilo;

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSiteProductName() {
        return siteProductName;
    }

    public void setSiteProductName(String siteProductName) {
        this.siteProductName = siteProductName;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getPricePerKilo() {

        return pricePerKilo;
    }

    public void setPricePerKilo(BigDecimal pricePerKilo) {
        this.pricePerKilo = pricePerKilo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceRow priceRow = (PriceRow) o;

        if (site != null ? !site.equals(priceRow.site) : priceRow.site != null) return false;
        if (siteProductName != null ? !siteProductName.equals(priceRow.siteProductName) : priceRow.siteProductName != null)
            return false;
        if (productPrice != null ? !productPrice.equals(priceRow.productPrice) : priceRow.productPrice != null)
            return false;
        return pricePerKilo != null ? pricePerKilo.equals(priceRow.pricePerKilo) : priceRow.pricePerKilo == null;

    }

    @Override
    public int hashCode() {
        int result = site != null ? site.hashCode() : 0;
        result = 31 * result + (siteProductName != null ? siteProductName.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (pricePerKilo != null ? pricePerKilo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PriceRow{" +
                "site='" + site + '\'' +
                ", siteProductName='" + siteProductName + '\'' +
                ", productPrice=" + productPrice +
                ", pricePerKilo=" + pricePerKilo +
                '}';
    }

}
