package org.example;

public class Calculator {
    public float plus(float x, float y){
        return x + y;
    }
    public float minus(float x, float y){
        return x - y;
    }
    public float multiply(float x, float y){
        return x * y;
    }
    public float division(float x, float y){
        if (y == 0){
            return Float.NaN;   // Indicates division by zero
        } else {
            return x / y;
        }
    }
    public float power(float value, float powerValue){
        return (float) Math.pow(value, powerValue);
    }
    public float root(float value){
        return (float) Math.sqrt(value);
    }
}