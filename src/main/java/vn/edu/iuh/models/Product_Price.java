package vn.edu.iuh.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@Table(name = "product_price")

public class Product_Price {

    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    @Id
    @Column(name = "price_date_time", columnDefinition = "datetime")
    private LocalDateTime priceDate;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "note")
    private String note;

    public Product_Price() {
    }

    public Product_Price(Product productId, LocalDateTime priceDate, double price, String note) {
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

    public LocalDateTime getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(LocalDateTime priceDate) {
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
