package com.example.exam1.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSales;

    @NotEmpty(message = "Không được để trống")
    private String subjectSales;

    private String timeBegin;

    private String timeEnd;
    @Min(value = 10000,message = "mức giá phải lớn hơn 10000")
    @NotNull(message = "Không được để trống")
    private Integer price;

    @NotEmpty(message = "Không được để trống")
    @Column(columnDefinition = "text")
    private String details;

    public Sales() {
    }

    public Integer getIdSales() {
        return idSales;
    }

    public void setIdSales(Integer idSales) {
        this.idSales = idSales;
    }

    public String getSubjectSales() {
        return subjectSales;
    }

    public void setSubjectSales(String subjectSales) {
        this.subjectSales = subjectSales;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
