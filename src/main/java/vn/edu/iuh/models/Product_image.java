package vn.edu.iuh.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class Product_image {

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product productId;

    @Id
    @Column(name = "image_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imgID;
    private String path;
    private  String alternative;

    public Product_image() {
    }

    public Product getProductId() {
        return productId;
    }

    public void setProductId(Product productId) {
        this.productId = productId;
    }

    public int getImgID() {
        return imgID;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "Product_image{" +
                "productId='" + productId + '\'' +
                ", imgID='" + imgID + '\'' +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
