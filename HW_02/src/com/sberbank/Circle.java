package com.sberbank;

public class Circle {
    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
    }


    public Double squareCalculation(){
        return this.radius*this.radius*Math.PI;
    }
}
