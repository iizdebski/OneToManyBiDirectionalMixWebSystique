package com.izdebski.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Integer addressId;

    @Column(name = "street_name", length = 50)
    private String street;

    @Column(name = "city_name", length = 50)
    private String city;

    @Column(name = "state_name")
    private String state;

    @Column(name = "pin_code")
    private Long pincode;

    @OneToMany(mappedBy = "address", cascade = CascadeType.ALL)
    private List<Employee> employee;

    public Address() {
    }

    public Address(String street, String city, String state, Long pincode, List<Employee> employees) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}