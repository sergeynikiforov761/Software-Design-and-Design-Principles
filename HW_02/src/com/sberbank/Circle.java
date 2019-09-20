package com.sberbank;

public class Circle {
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }


    public double getArea(){
        return radius * radius * Math.PI;
    }
}
