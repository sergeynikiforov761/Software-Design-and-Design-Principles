package com.sberbank;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void squareCalculation() {
        Rectangle rectangleFirst = new Rectangle(4.,5.);
        Rectangle rectangleSecond = new Rectangle(0.,0.);
        Rectangle rectangleThird = new Rectangle(1.,1.);
        Double firstSquare = 20.;
        Double SecondSquare = 0.;
        Double thirdSquare = 1.;
        Assert.assertEquals(rectangleFirst.squareCalculation(),firstSquare);
        Assert.assertEquals(rectangleSecond.squareCalculation(),SecondSquare);
        Assert.assertEquals(rectangleThird.squareCalculation(),thirdSquare);
    }
}