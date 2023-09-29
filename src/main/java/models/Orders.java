package models;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
@Table(name = "order")

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;

    @Column(name = "order_date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "emp_id")
    private Employee empId;
   @ManyToOne
   @JoinColumn(name = "cust_id")
    private  Customer custId;

    public Orders() {
    }

    public Orders(int id, Date date, Employee empId, Customer custId) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
