package com.example.labtestpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CircleTest {

    @Test
    public void testArea() {
        Circle circle = new Circle("Circle", 5.0);
        double expected = Math.PI * 5.0 * 5.0;
        assertEquals("The area of the circle is incorrect", expected, circle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Circle circle = new Circle("Circle", 5.0);
        double expected = 2 * Math.PI * 5.0;
        assertEquals("The perimeter of the circle is incorrect", expected, circle.perimeter(), 0.001);
    }

}

