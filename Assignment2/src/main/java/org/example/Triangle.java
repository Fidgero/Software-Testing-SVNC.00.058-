package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Triangle {
    public String checkTriangle(int a, int b, int c){

        if (a >= 200 || a <= 1){
            return "Value of A is not in the range of permitted values.";

        } else if (b >= 200 || b <= 1) {
            return "Value of B is not in the range of permitted values.";

        } else if (c >= 200 || c <= 1) {
            return "Value of C is not in the range of permitted values.";

        } else if (a > b+c || b > a+c || c > a+b){
            return "NotATriangle";

        } else {
            if (a == b && a == c){
                return "Equilateral";

            } else if (a == b && a != c
                    || a == c && a != b
                    || b == c && b != a) {
                return "Isosceles";

            } else if (a != b || a != c || b != c) {
                return "Scalene";

            } else {
                return "Test";
            }
        }
    }
}