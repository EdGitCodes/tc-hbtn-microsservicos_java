package com.example.product.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDateTime createdOne;
    private boolean status;
    private int codigo;

    public Product(){}
    public Product(Long id, String name, String description, BigDecimal price, LocalDateTime createdOne, boolean status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdOne = createdOne;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDateTime getCreatedOne() {
        return createdOne;
    }

    public void setCreatedOne(LocalDateTime createdOne) {
        this.createdOne = createdOne;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString(){
        return "rodaste";
    }

    @Override
    public int hashCode(){
        return Objects.hash(id, name, description, price, createdOne, status);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return status == product.status && Objects.equals(id, product.id)
                && Objects.equals(codigo, product.codigo)
                && Objects.equals(name, product.name)
                && Objects.equals(description, product.description)
                && Objects.equals(price, product.price)
                && Objects.equals(createdOne, product.createdOne);
    }
}
