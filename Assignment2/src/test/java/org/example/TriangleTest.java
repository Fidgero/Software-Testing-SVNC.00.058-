package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    @DisplayName("Equilateral Triangle")
    public void Equilateral(){
        Triangle myTriangle = new Triangle();
        assertEquals("Equilateral", myTriangle.checkTriangle(5,5,5));
    }

    @Test
    @DisplayName("Isosceles Triangle")
    public void Isosceles(){
        Triangle myTriangle = new Triangle();
        assertEquals("Isosceles", myTriangle.checkTriangle(5,5,8));
    }

    @Test
    @DisplayName("Scalene Triangle")
    public void Scalene(){
        Triangle myTriangle = new Triangle();
        assertEquals("Scalene", myTriangle.checkTriangle(3,4,5));
    }

    @Test
    @DisplayName("NotATriangle")
    public void NotATriangle(){
        Triangle myTriangle = new Triangle();
        assertEquals("NotATriangle", myTriangle.checkTriangle(5,5,20));
    }

    @Test
    @DisplayName("Value of A is not in the range of permitted values.")
    public void ValueA(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of A is not in the range of permitted values.", myTriangle.checkTriangle(10000,5,5));
    }

    @Test
    @DisplayName("Value of B is not in the range of permitted values.")
    public void ValueB(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of B is not in the range of permitted values.", myTriangle.checkTriangle(5,10000,5));
    }

    @Test
    @DisplayName("Value of C is not in the range of permitted values.")
    public void ValueC(){
        Triangle myTriangle = new Triangle();
        assertEquals("Value of C is not in the range of permitted values.", myTriangle.checkTriangle(5,5,10000));
    }
}