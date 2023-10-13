package vn.edu.iuh.models;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "product_price")

public class Product_Price {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    @Column(name = "price_date_time", columnDefinition = "datetime")
    private Date priceDate;
    private double price;
    private String note;

    public Product_Price() {
    }

    public Product_Price(Product productId, Date priceDate, double price, String note) {
        this.productId = productId;
        this.priceDate = priceDate;
        this.price = price;
        this.note = note;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
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
