package vn.edu.iuh.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")

public class Customer {

    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private  int id;

    @Column(name = "cust_name")
    private  String name;
    @Column(name = "email", unique = true,length = 150,nullable = true)
    private  String email;
    @Column(name = "phone",nullable = false)
    private  String phone;
    @Column(name = "address",length = 250,nullable = false)
    private  String address;
    @OneToMany(mappedBy = "customer")
    private List<Order> ordersList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer() {
    }

    public Customer(int id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
