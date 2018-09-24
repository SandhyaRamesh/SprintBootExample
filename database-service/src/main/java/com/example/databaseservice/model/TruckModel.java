package com.example.databaseservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name = "truckdetails")

public class TruckModel {
    public String getTruck_id() {
        return truck_id;
    }

    public void setTruck_id(String truck_id) {
        this.truck_id = truck_id;
    }

    public String getTruck_name() {
        return truck_name;
    }

    public void setTruck_name(String truck_name) {
        this.truck_name = truck_name;
    }

    public String getTruck_volume() {
        return truck_volume;
    }

    public void setTruck_volume(String truck_volume) {
        this.truck_volume = truck_volume;
    }
    @Id
    @NotBlank
    private String truck_id  ;
    @NotBlank
    //@Column(columnDefinition = "text")
    private String truck_name  ;
    @NotBlank
    private String truck_volume    ;

}
