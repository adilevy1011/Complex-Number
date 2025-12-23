

public class Complex{
    private final double a, b;//a + bi

    public Complex(){
        this(0,0);
    }

    public Complex(double real, double imaginary){
        this.a = real;
        this.b = imaginary;
    } 

    public Complex(double imaginary){
        this(imaginary,0);
    }

    public Complex(String s){ //"a b"
        String[] tokens = s.split(" ");
        double a = Double.parseDouble(tokens[0]);
        double b = Double.parseDouble(tokens[1]);
        this.a = a;
        this.b = b;
    }

    public double getReal(){
        return a;
    }
    public double getImaginary(){
        return b;
    }
    public boolean equals(Complex other){
        return a == other.a && b == other.b;
    }

    public Complex add(Complex other){
        return new Complex(a + other.a, b + other.b);
    }

    public double magnitude(){
        return Math.sqrt(a * a + b * b);
    }
    @Override
    public String toString(){
        return String.format("%.1f + %.1f", a,b);
    }
    
}