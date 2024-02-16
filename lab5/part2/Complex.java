import java.math.BigDecimal;

public class Complex<T extends BigDecimal> {
	
	private T real;
	private T img;
	
	public Complex(T real, T img) {
		this.real = real;
		this.img = img;
		
	}
	
	public T getReal() {
		return real;
	}
	
	public T getImg() {
		return img;
	}
	
	public Complex addComplex(Complex c) {
		
		return new Complex( (T) this.real.add(c.real) , (T) this.img.add(c.img) );
		
	}
	
	public Complex subComplex(Complex c) {
		
		return new Complex( (T) this.real.subtract(c.real), (T) this.img.subtract(c.img));
	}
	
	public Complex MultComplex(Complex c) {
		T real = (T) ((this.real.multiply(c.real)).subtract(this.img.multiply(c.img)));
		T imag = (T) ((this.real.multiply(c.img)).add(this.img.multiply(c.real)));	
		return new Complex(real, imag);
	}
	
}