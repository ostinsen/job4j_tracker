package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance3D() {
        Point one = new Point(3, 0, 0);
        Point two = new Point(3, 3, 0);
        double out = one.distance3D(two);
        double exp = 3;
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void distance3D1() {
        Point one = new Point(0, 0, 0);
        Point two = new Point(4, 3, 0);
        double out = one.distance3D(two);
        double exp = 5;
        Assert.assertEquals(exp, out, 0.01);
    }

    @Test
    public void distance3D2() {
        Point one = new Point(3, 100, 12);
        Point two = new Point(3, 3, 3);
        double out = one.distance3D(two);
        double exp = 97.41;
        Assert.assertEquals(exp, out, 0.01);
    }
}