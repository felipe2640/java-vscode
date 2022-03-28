package com.examplesql.springgradle;

import javax.annotation.Generated;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Indexed;

@EntityScan
// @Table(name = "cars")

public class car {
    // @Id
    // @Column
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // @Column
    private String name;
    // @Column
    private Integer year;
    // @Column
    private String color;

    // public Car(){

    // }

    /*
     * public Car(String name, Integer year, String color){
     * this.name = name;
     * this.year = year;
     * this.color = color;
     * }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
