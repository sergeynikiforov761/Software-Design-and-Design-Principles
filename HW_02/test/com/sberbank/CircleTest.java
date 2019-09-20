package com.sberbank;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {

    public final static double DELTA = 1e-15;

    @Test
    public void getAreaCircle() {
        Assert.assertEquals(new Circle(5.).getArea(),5. * 5. * Math.PI, DELTA);
    }

    @Test
    public void getZeroAreaCircle(){
        Assert.assertEquals(new Circle(0.).getArea(),0. * 0. * Math.PI, DELTA);
    }

}