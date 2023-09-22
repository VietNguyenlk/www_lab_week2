package models;

import java.sql.Date;

public class Order {
    private String id;
    private Date date;
    private String empId;
    private  String custId;

    public Order() {
    }

    public Order(String id, Date date, String empId, String custId) {
        this.id = id;
        this.date = date;
        this.empId = empId;
        this.custId = custId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }
}
