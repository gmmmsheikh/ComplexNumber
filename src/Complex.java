
public class Complex implements Comparable{
    private final double re;   // the real part
    private final double im;   // the imaginary part

    // create a new object with the given real and imaginary parts
    public Complex(double real, double imag) {
        re = real;
        im = imag;
    }
    public Complex(double real) {
    	re = real;
		this.im = 0;
    }
    public Complex() {
    	this.im = 0;
    	this.re = 0;
    }
    
    public double getRealPart() {
    	return re;
    }
    public double getImaginaryPart() {
    	return im;
    }
    // return a string representation of the invoking Complex object
    public String toString() {
        if (im == 0) return re + "";
        if (re == 0) return im + "i";
        if (im <  0) return re + " - " + (-im) + "i";
        return re + " + " + im + "i";
    }

    // return absolute value
    public double abs() {
        return Math.hypot(re, im);
    }

    // return a new Complex object whose value is (this + b)
    public Complex add(Complex b) {
        Complex a = this;           
        double real = a.re + b.re;
        double imag = a.im + b.im;
        return new Complex(real, imag);
    }

    // return a new Complex object whose value is (this - b)
    public Complex subtract(Complex b) {
        Complex a = this;
        double real = a.re - b.re;
        double imag = a.im - b.im;
        return new Complex(real, imag);
    }

    // return a new Complex object whose value is (this * b)
    public Complex multiply(Complex b) {
        Complex a = this;
        double real = a.re * b.re - a.im * b.im;
        double imag = a.re * b.im + a.im * b.re;
        return new Complex(real, imag);
    }

    // return a new object whose value is (this * alpha)
    public Complex scale(double alpha) {
        return new Complex(alpha * re, alpha * im);
    }

    // return a / b
    public Complex divide(Complex b) {
        Complex a = this;
        return a.multiply(b.reciprocal());
    }
    
    // return a new Complex object whose value is the reciprocal of this. Used in division
    public Complex reciprocal() {
        double scale = re*re + im*im;
        return new Complex(re / scale, -im / scale);
    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
