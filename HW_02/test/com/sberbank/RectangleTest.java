package com.sberbank;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    public final static double DELTA = 1e-15;

    @Test
    public void getAreaRectangle() {
        Assert.assertEquals(new Rectangle(6.,4.).getArea(),6. * 4., DELTA);

    }
    @Test
    public void getZeroAreaRectangle(){
        Assert.assertEquals(new Rectangle(0.,0.).getArea(),0. * 0., DELTA);
    }
}