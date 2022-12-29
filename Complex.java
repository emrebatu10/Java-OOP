package OOP;

public class Complex {

    private double real;
    private double imaginary;

    // Constructor

    public Complex(double real,double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // Setter-Mutator

    public  void setReal(double real){
        this.real= real;
    }

    public void setImaginary(double imaginary){
        this.imaginary= imaginary;
    }

    // Getter-Accessor

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
