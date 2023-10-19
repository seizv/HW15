package org.example;

public class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(double real) {
        this.real=real;
        this.imaginary = 0;
    }

    public boolean equals (Complex other){
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public boolean equals (double other){
        return this.real == other;
    }

}
