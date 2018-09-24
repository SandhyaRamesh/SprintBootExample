package com.example.databaseservice.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
@Entity
@Table(name = "productdetails")
public class ProductModel {
    @NotBlank @Id
    private String product_id ;
    @NotBlank
    //@Column(columnDefinition = "text")
    private String product_name ;
    @NotBlank
    private String p_length   ;
    @NotBlank
    private String p_breadth  ;
    @NotBlank
    private String p_height  ;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getP_length() {
        return p_length;
    }

    public void setP_length(String p_length) {
        this.p_length = p_length;
    }

    public String getP_breadth() {
        return p_breadth;
    }

    public void setP_breadth(String p_breadth) {
        this.p_breadth = p_breadth;
    }

    public String getP_height() {
        return p_height;
    }

    public void setP_height(String p_height) {
        this.p_height = p_height;
    }
}
