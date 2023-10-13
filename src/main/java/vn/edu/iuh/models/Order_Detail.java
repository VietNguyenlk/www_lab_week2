package vn.edu.iuh.models;

import jakarta.persistence.*;

@Entity
@Table(name = "order_detail")
public class Order_Detail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id" )
    private  Orders orderId;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;
    private  int quantity;
    private double price;
    private String note;

    public Order_Detail() {
    }

    public Order_Detail(Orders orderId, Product productId, int quantity, double price, String note) {
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
        this.note = note;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return "Order_Detail{" +
                "orderId='" + orderId + '\'' +
                ", productId='" + productId + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", note='" + note + '\'' +
                '}';
    }
}
