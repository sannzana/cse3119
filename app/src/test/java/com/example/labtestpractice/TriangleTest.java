package com.example.labtestpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void testArea() {
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        double s = (3.0 + 4.0 + 5.0) / 2;
        double expected = Math.sqrt(s * (s - 3.0) * (s - 4.0) * (s - 5.0));
        assertEquals("The area of the triangle is incorrect", expected, triangle.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Triangle triangle = new Triangle("Triangle", 3.0, 4.0, 5.0);
        double expected = 3.0 + 4.0 + 5.0;
        assertEquals("The perimeter of the triangle is incorrect", expected, triangle.perimeter(), 0.001);
    }
}
