package com.example.exercise1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "không được để trống")
    @Size(min = 5, max = 45, message = "độ dài tối thiểu là 5 và tối đa 45 kí tự")
    private String firstName;
    @NotEmpty(message = "không được để trống")
    @Size(min = 5, max = 45, message = "độ dài tối thiểu là 5 và tối đa 45 kí tự")
    private String lastName;

    @Min(18)
    private Integer age;

    @Pattern(regexp = "(89||0)[0-9]{9}",message = "số điện thoại không đúng định dạng")
    private String phoneNumber;

    @Pattern(regexp = "^[a-zA-Z0-9]+@gmail.com$",message = "mail không đúng định dạng")
    private String gmail;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}
