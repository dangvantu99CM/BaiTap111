/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dang Van Tu
 */
public class ComplexNumber {

    private double real;
    private double imag;

    public ComplexNumber() {
        real = 0;
        imag = 0;
    }

    public ComplexNumber(double x, double y) {
        real = x;
        imag = y;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imag;
    }

    public void setReal(double x) {
        real = x;
    }

    public void setImaginary(double y) {
        imag = y;
    }

    public ComplexNumber add(ComplexNumber other, ComplexNumber other1) {
        ComplexNumber c = new ComplexNumber();
        c.imag = other1.imag + other.imag;
        c.real = other1.real + other.real;
        return c;
    }
    public ComplexNumber multiply(ComplexNumber other, ComplexNumber other1){
        ComplexNumber c = new ComplexNumber();
        c.real = other.real*other1.real - other.imag*other1.imag;
        c.imag = other.imag*other1.real + other.real*other1.imag;
        return c;
    }
    public ComplexNumber divide(ComplexNumber other1, ComplexNumber other2){
        if((other1.imag == 0 && other1.real == 0) || (other2.imag == 0 && other2.real == 0))
            System.out.println("Nhap lai khi 2 gia tri lien tiep bang 0. Thanks!");
        ComplexNumber c = new ComplexNumber();
        double tu = other1.imag*other2.imag + other1.real*other2.real + other1.real*other2.imag;
        c.real = tu/(other1.imag*other1.imag + other1.real*other1.real);
        c.imag = (-other2.real*other1.imag)/(other1.imag*other1.imag + other1.real*other1.real);
        return c;
    }
    public ComplexNumber subtract(ComplexNumber other1, ComplexNumber other2){
        ComplexNumber c = new ComplexNumber();
        c.real = other1.real - other2.real;
        c.imag = other1.imag - other2.imag;
        return c;
    }
    public String toString(){
        return real +"+"+ imag + "i" + "\n";
    }
    
    
}

