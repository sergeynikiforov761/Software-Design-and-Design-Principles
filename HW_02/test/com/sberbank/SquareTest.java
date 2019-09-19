package com.sberbank;

import org.junit.Assert;
import org.junit.Test;


public class SquareTest {

    @Test
    public void squareCalculation() {
        Square squareFirst = new Square(5.);
        Double firstSquare = 25.;
        Square squareSecond = new Square(0.);
        Double secondSquare = 0.;
        Square squareThird = new Square(6.);
        Double thirdSquare = 36.;

        Assert.assertEquals(firstSquare, squareFirst.squareCalculation());
        Assert.assertEquals(secondSquare, squareSecond.squareCalculation());
        Assert.assertEquals(thirdSquare, squareThird.squareCalculation());
    }
}