package com.sberbank;

public class Square {
    private Double side;

    public Square(Double side){
        this.side = side;
    }

    public Double squareCalculation() {
        return this.side*this.side;
    }
}
