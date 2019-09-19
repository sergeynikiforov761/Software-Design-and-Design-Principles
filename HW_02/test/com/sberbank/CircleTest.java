package com.sberbank;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    @Test
    public void squareCalculation() {
        Circle circleFirst = new Circle(5.);
        Double firstSquare = 25. * Math.PI;
        Circle circleSecond = new Circle(0.);
        Double secondSquare = 0.;
        Circle circleThird = new Circle(6.);
        Double thirdSquare = 36. * Math.PI;

        Assert.assertEquals(firstSquare, circleFirst.squareCalculation());
        Assert.assertEquals(secondSquare, circleSecond.squareCalculation());
        Assert.assertEquals(thirdSquare, circleThird.squareCalculation());
    }
}