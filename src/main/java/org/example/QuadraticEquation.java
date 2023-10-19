package org.example;


public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) throws Exception {
        if (a == 0) {
            throw new Exception ("a should not be equal to 0");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Complex[] solve() {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            return new Complex[]{new Complex(root1), new Complex(root2)};
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            return new Complex[]{new Complex(root)};
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            Complex root1 = new Complex(realPart, imaginaryPart);
            Complex root2 = new Complex(realPart, -imaginaryPart);
            return new Complex[] { root1, root2 };
        }
    }
}

