package com.example.furama.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//    @Pattern(regexp = "^[A-Z]{1}[a-z\\s]$", message = "Tên không đúng định dạng")
    @NotEmpty(message = "Không được để trống")
//    @Pattern(regexp = "\\b[A-Z][a-z]*\\b", message = "tên không đúng định dạng")
    private String nameCustomer;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^(([1][9]([2-9][3-9]|[3-9][0-9]))|([2][0]{2}[0-4]+))[-|/]\\d{2}[-|/]\\d{2}$",message = "ngày sinh phải >= 18 tuổi ")
    private String dayOfBirth;

    @NotEmpty(message = "Không được để trống")
    private String gender;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "[0-9]{9}",message = "Số chứng minh phải có 9 chữ số")
    private String idCard;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "(090|091|([(]84[)])\\+90|([(]84[)])\\+91)+[0-9]{7}",message = "Số điện thoại không đúng định dạng")
    private String phoneNumber;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^[a-zA-Z0-9]+@gmail.com$",message = "mail không đúng định dạng")
    private String email;

    @ManyToOne
    @JoinColumn
    private CustomerType customerType;

    @NotEmpty(message = "Không được để trống")
    private String address;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
