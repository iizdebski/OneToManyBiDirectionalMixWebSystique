package com.izdebski.model;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name", length = 200, nullable = false)
    private String employeeName;

    @Column(name = "email")
    private String email;

    @Column(name = "date_of_join")
    private Date doj;

    @Column(name = "salary")
    private Double salary;

    @ManyToOne(optional = false)
    @JoinColumn(name = "address_id")
    private Address address;

    public Employee() {
    }

    public Employee(String employeeName, String email, Date doj, Double salary, Address address) {
        this.employeeName = employeeName;
        this.email = email;
        this.doj = doj;
        this.salary = salary;
        this.address = address;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (employeeId ^ (employeeId >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Employee))
            return false;
        Employee other = (Employee) obj;
        if (employeeId != other.employeeId)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", doj=" + doj +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}