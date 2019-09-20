package com.sberbank;

import org.junit.Assert;
import org.junit.Test;


public class SquareTest {

    public final static double DELTA = 1e-15;

    @Test
    public void getAreaSquare() {
        Assert.assertEquals(new Square(5.).getArea(),5. * 5., DELTA);
    }

    @Test
    public void getZeroAreaRectangle(){
        Assert.assertEquals(new Square(0.).getArea(),0. * 0., DELTA);
    }
}