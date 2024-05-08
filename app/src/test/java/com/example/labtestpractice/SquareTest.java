package com.example.labtestpractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareTest {

    @Test
    public void testArea() {
        Square square = new Square("Square", 4.0);
        double expected = 4.0 * 4.0;
        assertEquals("The area of the square is incorrect", expected, square.area(), 0.001);
    }

    @Test
    public void testPerimeter() {
        Square square = new Square("Square", 4.0);
        double expected = 4 * 4.0;
        assertEquals("The perimeter of the square is incorrect", expected, square.perimeter(), 0.001);
    }
}

