package models;

import java.sql.Date;

public class Product_Price {
    private String productId;
    private Date priceDate;
    private double price;
    private String note;

    public Product_Price() {
    }

    public Product_Price(String productId, Date priceDate, double price, String note) {
        this.productId = productId;
        this.priceDate = priceDate;
        this.price = price;
        this.note = note;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Product_Price{" +
                "productId='" + productId + '\'' +
                ", priceDate=" + priceDate +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
