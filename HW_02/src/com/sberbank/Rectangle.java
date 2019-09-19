package com.sberbank;

public class Rectangle {
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }

    public Double squareCalculation(){
        return this.length*this.width;
    }
}