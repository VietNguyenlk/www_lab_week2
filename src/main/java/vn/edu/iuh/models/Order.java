package vn.edu.iuh.models;

import jakarta.persistence.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "order_date",nullable = false)
    private LocalDateTime date;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee empId;
   @ManyToOne
   @JoinColumn(name = "cust_id")
    private  Customer custId;

   @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
   @JoinColumn
   private List<Order_Detail> orderDetails;

    public Order() {
    }

    public Order(int id, LocalDateTime date, Employee empId, Customer custId) {
        this.id = id;
        this.date = date;
        this.empId = empId;
        this.custId = custId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Employee getEmpId() {
        return empId;
    }

    public void setEmpId(Employee empId) {
        this.empId = empId;
    }

    public Customer getCustId() {
        return custId;
    }

    public void setCustId(Customer custId) {
        this.custId = custId;
    }
}
